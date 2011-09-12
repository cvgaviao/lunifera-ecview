package org.eclipse.emf.emfstore.teamprovider.recording.git;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.compare.ITypedElement;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.egit.core.internal.storage.GitFileRevision;
import org.eclipse.egit.core.op.AddToIndexOperation;
import org.eclipse.egit.core.project.RepositoryMapping;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.emfstore.teamprovider.recording.AbstractVCSProvider;
import org.eclipse.emf.emfstore.teamprovider.recording.IRepository;
import org.eclipse.emf.emfstore.teamprovider.recording.IRevision;

import org.eclipse.emf.emfstore.teamprovider.recording.impl.FileUtil;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.RepositoryNotFoundException;
import org.eclipse.emf.emfstore.teamprovider.recording.impl.ResourceFactoryRegistry;
import org.eclipse.jgit.api.AddCommand;
import org.eclipse.jgit.api.RebaseCommand;
import org.eclipse.jgit.api.errors.NoFilepatternException;
import org.eclipse.jgit.dircache.DirCache;
import org.eclipse.jgit.dircache.DirCacheEntry;
import org.eclipse.jgit.dircache.DirCacheIterator;
import org.eclipse.jgit.errors.CorruptObjectException;
import org.eclipse.jgit.errors.IncorrectObjectTypeException;
import org.eclipse.jgit.errors.MissingObjectException;
import org.eclipse.jgit.errors.NoWorkTreeException;
import org.eclipse.jgit.lib.Constants;
import org.eclipse.jgit.lib.IndexDiff;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.lib.RepositoryState;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.revwalk.RevWalk;
import org.eclipse.jgit.revwalk.filter.RevFilter;
import org.eclipse.jgit.treewalk.AbstractTreeIterator;
import org.eclipse.jgit.treewalk.FileTreeIterator;
import org.eclipse.jgit.treewalk.TreeWalk;
import org.eclipse.jgit.treewalk.WorkingTreeIterator;
import org.eclipse.jgit.treewalk.filter.AndTreeFilter;
import org.eclipse.jgit.treewalk.filter.NotIgnoredFilter;
import org.eclipse.jgit.treewalk.filter.OrTreeFilter;
import org.eclipse.jgit.treewalk.filter.PathFilter;
import org.eclipse.jgit.treewalk.filter.TreeFilter;
import org.eclipse.jgit.util.FS;
import org.eclipse.jgit.util.IO;
import org.eclipse.jgit.util.RawParseUtils;
import org.eclipse.osgi.util.NLS;
import org.eclipse.team.core.history.IFileRevision;

public class GitVCSProvider extends AbstractVCSProvider<RevCommit, Repository> {

	/**
	 * Clears the history file, if its content has not been modified since the last pull request.
	 * 
	 * @param historyFile the history file that needs to be cleared
	 * @return true, if the history file has been cleared, false otherwise
	 * @throws InvocationTargetException if the repository the history file should be contained 
	 * 			in could not be determined
	 * @throws IOException if the history file could not cleared for I/O related reasons
	 */
	@Override
	public boolean clearHistFile(IFile historyFile) throws IOException {
	
		RepositoryMapping mapping = RepositoryMapping.getMapping(historyFile.getProject());
		Repository repo = mapping.getRepository();

		if (repo != null && repo != mapping.getRepository()) {
					new IllegalStateException("No unique repository");
		}

		TreeWalk walk = new TreeWalk(repo);
		walk.addTree(new FileTreeIterator(repo));
		WorkingTreeIterator workingTreeIterator = walk.getTree(0,
				WorkingTreeIterator.class);

		IndexDiff diff = new IndexDiff(repo, "HEAD", workingTreeIterator);
		diff.diff();

		boolean wasCleared = false;
		if (historyFile.exists()) {
			// TODO: is there a better way for the containment check?
			if (!diff.getModified().contains(historyFile.getFullPath().toString().substring(1))) {
				// if history file has not been modified, its content may get cleared
				// in any other cases, operations have been added to the history file
				// and the modify check will evaluate to true
				URI historyUri = FileUtil.getUri(historyFile);
				ResourceSet resourceSet = new ResourceSetImpl();
				Object defaultFactory = ResourceFactoryRegistry.getDefaultFactory("ecore");
				XMIResource historyResource = (XMIResource) ((Resource.Factory.Descriptor) defaultFactory).createFactory().createResource(historyUri); 
				historyResource.getContents().clear();
				historyResource.save(null);
				wasCleared  = true;
			}
		}

		return wasCleared;
	}

	// TODO: pull --rebase??
	@Override
	public void pullHook() {
		// TODO Auto-generated method stub

	}

//	@Override 
//	public IFileRevision getFileRevision(IRepository<R> repository, 
//			IRevision<T> revision, String objectId) {
//		RevCommit rev = revision.getRevision();
//		IRepository<Repository> repo = repository.getRepository();
//		TreeWalk w = TreeWalk.forPath(repo.getRepository(), objectId, rev.getRevision().getTree());
//		// check if file is contained in commit
//		if (w != null) {
//			final IFileRevision fileRevision = GitFileRevision.inCommit(repository,
//					revision, objectId, null);
//			return fileRevision;
//		}
//		return null;
//	}
 
	@Override
	public void resolveConflict(IFile file) {
		AddCommand addCmd;
		try {
			addCmd = new AddCommand(getRepository(file.getProject()).getRepository());
			addCmd.addFilepattern(file.getFullPath().toString().substring(1));
			addCmd.addFilepattern(FileUtil.getFile(FileUtil.getUri(file)).getFullPath().toString().substring(1));
			addCmd.call();
		} catch (RepositoryNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoFilepatternException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getArtifactFile(IResource resource, IProgressMonitor monitor) throws IOException, InterruptedException, RepositoryNotFoundException {
		IRevision<RevCommit> rightRevision = getRightRevision(resource, monitor);
//		IRevision<RevCommit> headRevision = getHeadRevision(resource, monitor);
		IRepository<Repository> repository = getRepository(resource);
//		IRevision<RevCommit> ancestorCommit = getAncestorRevision(
//				rightRevision, headRevision, repository, monitor);
		return getFile(resource, rightRevision, monitor);
	}
	
	public IRevision<RevCommit> getRightRevision(IResource resource, IProgressMonitor monitor) 
	throws IOException, InterruptedException {
		String target;
		IRepository<Repository> repository = null;
		try {
			repository = getRepository(resource.getProject());
		} catch (RepositoryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		if (repository.getRepository().getRepositoryState().equals(RepositoryState.MERGING)) {
			target = Constants.MERGE_HEAD;
		} else if (repository.getRepository().getRepositoryState().equals(RepositoryState.CHERRY_PICKING)) {
			target = Constants.CHERRY_PICK_HEAD;
		} else if (repository.getRepository().getRepositoryState().equals(
				RepositoryState.REBASING_INTERACTIVE)) {
			target = readFile(repository.getRepository().getDirectory(),
					RebaseCommand.REBASE_MERGE + File.separatorChar
							+ RebaseCommand.STOPPED_SHA);
		} else {
			target = Constants.ORIG_HEAD;
		}
		
		return getCommit(resource, target, monitor);
	}
	
	public IRevision<RevCommit> getHeadRevision(IResource resource, IProgressMonitor monitor) 
	throws IOException, InterruptedException {
		IRepository<Repository> repository = null;
		try {
			repository = getRepository(resource.getProject());
		} catch (RepositoryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectId head = repository.getRepository().resolve(Constants.HEAD);
		if (head == null) {
			throw new IOException("UIText.ValidationUtils_CanNotResolveRefMessage, Constants.HEAD");
		}

		return getCommit(resource, Constants.HEAD, monitor);
	}
	
	private IRevision<RevCommit> getCommit(IResource resource, String target, IProgressMonitor monitor) 
	throws InterruptedException, IOException {
		// make sure all resources belong to the same repository
		RevWalk revWalk = null;

		monitor.beginTask("Checking resources", IProgressMonitor.UNKNOWN); 
		List<String> filterPaths = new ArrayList<String>();
		// TODO: duplicate code -> activator.java
		Repository repository = null;
		RepositoryMapping map = RepositoryMapping.getMapping(resource.getProject());

		if (repository != null && repository != map.getRepository()) {
			throw new IllegalStateException("No unique repository");
		}

		filterPaths.add(map.getRepoRelativePath(resource));
		repository = map.getRepository();

		if (repository == null) {
			throw new IllegalStateException("No unique repository");
		}

		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}

		revWalk = new RevWalk(repository);
		ObjectId objectId = repository.resolve(target);
		
		if (objectId == null) {
			throw new IOException(NLS.bind(
					String.format("Can not resolve given target {0}", target),
					target));
		}
		
		RevCommit commit = revWalk.parseCommit(objectId);
		return new GitRevision(commit); //project, repository, commit);
	}
		
	public String getFile(IResource resource,
			IRevision<RevCommit> commit, 
			IProgressMonitor monitor) {
		
		monitor.setTaskName("TODO");//UIText.GitMergeEditorInput_CalculatingDiffTaskName);
		RepositoryMapping map = RepositoryMapping.getMapping(resource.getProject());
		
		List<String> filterPaths = new ArrayList<String>();
		filterPaths.add(map.getRepoRelativePath(resource));
		Repository repository = map.getRepository();
		RevWalk rw = new RevWalk(repository);

		TreeWalk tw = new TreeWalk(repository);
	
		int dirCacheIndex;
		String s = null;
		try {
			dirCacheIndex = tw.addTree(new DirCacheIterator(repository
					.readDirCache()));
			int fileTreeIndex = tw.addTree(new FileTreeIterator(repository));
			int repositoryTreeIndex = tw.addTree(rw.parseTree(repository
					.resolve(Constants.HEAD)));
			// skip ignored resources
			NotIgnoredFilter notIgnoredFilter = new NotIgnoredFilter(
					fileTreeIndex);

			// filter by selected resources
			if (filterPaths.size() > 1) {
				List<TreeFilter> suffixFilters = new ArrayList<TreeFilter>();
				for (String filterPath : filterPaths)
					suffixFilters.add(PathFilter.create(filterPath));
				TreeFilter otf = OrTreeFilter.create(suffixFilters);
				tw.setFilter(AndTreeFilter.create(otf, notIgnoredFilter));
			} else if (filterPaths.size() > 0)
				tw.setFilter(AndTreeFilter.create(PathFilter.create(filterPaths
						.get(0)), notIgnoredFilter));
			else
				tw.setFilter(notIgnoredFilter);

			tw.setRecursive(true);
		
			while (tw.next()) {
				if (monitor.isCanceled())
					throw new InterruptedException();
				String gitPath = tw.getPathString();
				monitor.setTaskName(gitPath);

				FileTreeIterator fit = tw.getTree(fileTreeIndex,
						FileTreeIterator.class);
				if (fit == null)
					continue;

				DirCacheIterator dit = tw.getTree(dirCacheIndex,
						DirCacheIterator.class);

				final DirCacheEntry dirCacheEntry = dit == null ? null : dit
						.getDirCacheEntry();

				boolean conflicting = dirCacheEntry != null
				&& dirCacheEntry.getStage() > 0;

				AbstractTreeIterator rt = tw.getTree(repositoryTreeIndex,
						AbstractTreeIterator.class);

				// compare local file against HEAD to see if it was modified
				boolean modified = rt != null
				&& !fit.getEntryObjectId()
				.equals(rt.getEntryObjectId());

				// if this is neither conflicting nor changed, we skip it
				//				if (!conflicting && !modified)
				//					continue;

				ITypedElement right;
				IFileRevision fileRevision;
				// TODO: conflicting muss sich auf ecore beziehne
				// TODO: parameter checken
				fileRevision = getFileRevision(new GitRepository(repository), commit, gitPath);

				try {
					if (fileRevision != null) {
						IStorage storage = fileRevision.getStorage(null);
						s = FileUtil.slurpAndClose(storage.getContents());
					} else {
						IPath locationPath = new Path(fit.getEntryFile().getPath());
						final IFile file = ResourcesPlugin.getWorkspace().getRoot()
						.getFileForLocation(locationPath);
						if (file == null) {
							// TODO in the future, we should be able to show a version
							// for a non-workspace file as well
							continue;
						}
						fileRevision = GitFileRevision.inCommit(repository, commit.getRevision(),
								gitPath, null);
						IStorage storage;

						storage = fileRevision.getStorage(null);
						s = FileUtil.slurpAndClose(storage.getContents());
					}
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				tw.release();
			}
		} catch (MissingObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncorrectObjectTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CorruptObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoWorkTreeException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return s;
	}

	private String readFile(File directory, String fileName) throws IOException {
		byte[] content = IO.readFully(new File(directory, fileName));
		// strip off the last LF
		int end = content.length;
		while (0 < end && content[end - 1] == '\n')
			end--;
		return RawParseUtils.decode(content, 0, end);
	}

	public IRepository<Repository> getRepository(IResource resource) throws RepositoryNotFoundException {
		Repository repository = null;
		List<String> filterPaths = new ArrayList<String>();
		RepositoryMapping map = RepositoryMapping.getMapping(resource.getProject());
		repository = map.getRepository();

		if (repository != null && repository != map.getRepository()) {
			throw new RepositoryNotFoundException(
					new IllegalStateException("No unique repository"));
		}

		filterPaths.add(map.getRepoRelativePath(resource));
		repository = map.getRepository();

		if (repository == null) {
			throw new RepositoryNotFoundException(
					new IllegalStateException("No unique repository"));
		}

		return new GitRepository(repository);
	}

	@Override
	public IRevision<RevCommit> getAncestorRevision(
			IRevision<RevCommit> rightRevision,
			IRevision<RevCommit> headRevision, IRepository<Repository> repository,
			IProgressMonitor monitor)
			throws IOException, InterruptedException {
		
		final String fullBranch;
		
		RevWalk revWalk = new RevWalk(repository.getRepository());
		fullBranch = repository.getRepository().getFullBranch();

		// try to obtain the common ancestor
		List<RevCommit> startPoints = new ArrayList<RevCommit>();
		revWalk.setRevFilter(RevFilter.MERGE_BASE);
		startPoints.add(rightRevision.getRevision());
		startPoints.add(headRevision.getRevision());
		RevCommit ancestorCommit;
		
		try {
			revWalk.markStart(startPoints);
			ancestorCommit = revWalk.next();
		} catch (Exception e) {
			ancestorCommit = null;
		}

		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
		
		return new GitRevision(ancestorCommit);
	}

	@Override
	public IFileRevision getFileRevision(IRepository<Repository> repository,
			IRevision<RevCommit> revision, String objectId) {
//		RevCommit rev = revision.getRevision();
//		IRepository<Repository> repo = repository.getRepository();
		TreeWalk w;
		try {
			w = TreeWalk.forPath(repository.getRepository(), objectId, revision.getRevision().getTree());
			if (w != null) {
				final IFileRevision fileRevision = GitFileRevision.inCommit(repository.getRepository(),
						revision.getRevision(), objectId, null);
				return fileRevision;
			}
		} catch (MissingObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncorrectObjectTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CorruptObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// check if file is contained in commit
		
		return null;
	}
	
	public void addToVCS(IFile file) {
		RepositoryMapping mapping = RepositoryMapping.getMapping(file);

		if (mapping != null) {
			Repository repository = mapping.getRepository();
			try {
				DirCache cache = new DirCache(repository.getIndexFile(), FS.DETECTED);
				cache.read();
				for (int i = 0; i < cache.getEntryCount(); i++) {
					DirCacheEntry entry = cache.getEntry(i);
					if (entry.getPathString().equals(file.getFullPath().makeRelative().toString())) {
						// selected file is either added or staged 
						// thus we may add the version file to the staging area
//						String historyFileName = FileUtil.getHistoryFilename(file); 
						
//						IResource historyFile = file.getProject().findMember(historyFileName);
						
						if (file != null) {
							// add to index -> extract
							AddToIndexOperation addToIndexOp = new AddToIndexOperation(Collections.singleton(file));
							addToIndexOp.execute(new NullProgressMonitor());
						}
					}
				}
			} catch (NoWorkTreeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CorruptObjectException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
