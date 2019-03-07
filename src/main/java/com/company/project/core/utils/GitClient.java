package com.company.project.core.utils;

import org.eclipse.jgit.api.CloneCommand;
import org.eclipse.jgit.api.CommitCommand;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.RemoteAddCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * JGit API测试
 */
public class GitClient {

	/**
	 * 克隆远程库
	 * 
	 * @throws IOException
	 * @throws GitAPIException
	 */
	public static void Clone(String remotePath, String localPath, String username, String password)
			throws IOException, GitAPIException {
		// 设置远程服务器上的用户名和密码
		UsernamePasswordCredentialsProvider usernamePasswordCredentialsProvider = new UsernamePasswordCredentialsProvider(
				username, password);

		// 克隆代码库命令
		CloneCommand cloneCommand = Git.cloneRepository();

		if (null != username && !"".equals(username)) {
			Git git = cloneCommand.setURI(remotePath) // 设置远程URI
					.setBranch("master") // 设置clone下来的分支
					.setDirectory(new File(localPath)) // 设置下载存放路径
					.setCredentialsProvider(usernamePasswordCredentialsProvider) // 设置权限验证
					.call();
			System.out.println(git.tag());
		} else {
			Git git = cloneCommand.setURI(remotePath) // 设置远程URI
					.setBranch("master") // 设置clone下来的分支
					.setDirectory(new File(localPath)) // 设置下载存放路径
					.call();
			System.out.println(git.tag());
		}

		System.out.println("clone项目成功");

	}

	/**
	 * 本地新建仓库
	 */

	public static void testCreate(String initPath) throws IOException {
		// 本地新建仓库地址
		Repository newRepo = FileRepositoryBuilder.create(new File(initPath + "/.git"));
		newRepo.create();

		System.out.println("新建项目成功");
	}

	/**
	 * remote本地代码关联远程仓库地址
	 * 
	 * @throws URISyntaxException
	 */

	public static void remoteNewOrigin(String localPath, String remotePath, String remote, String username,
			String password) throws IOException, JGitInternalException, GitAPIException, URISyntaxException {
		// Git git = Git.cloneRepository().setURI(remoteRepoURI).setDirectory(new
		// File(localRepoPath)).call();
		UsernamePasswordCredentialsProvider usernamePasswordCredentialsProvider = new UsernamePasswordCredentialsProvider(
				username, password);
		Git git = new Git(new FileRepository(localPath + "/.git"));
		// git仓库地址
		RemoteAddCommand remoteAddCommand = git.remoteAdd();
		remoteAddCommand.setName(remote);
		remoteAddCommand.setUri(new URIish(remotePath));
		remoteAddCommand.call();

		System.out.println("关联远程项目成功");
		System.out.print(git.tag());
	}

	/**
	 * 本地仓库新增暂存文件
	 */

	public static void Add(String localPath) throws IOException, GitAPIException {

		// git仓库地址
		Git git = new Git(new FileRepository(localPath + "/.git"));

		// 添加文件
		git.add().addFilepattern(".").call();

		System.out.println("添加文件成功");
	}

	/**
	 * 本地仓库创建tag
	 */

	public static void AddTag(String localPath, String tagName) throws IOException, GitAPIException {

		// git仓库地址
		Git git = new Git(new FileRepository(localPath + "/.git"));

		// 添加文件
		git.tag().setName(tagName).call();

		System.out.println("添加tag成功");
	}

	/**
	 * 本地提交代码
	 */

	public static void Commit(String localPath) throws IOException, GitAPIException, JGitInternalException {
		// git仓库地址
		Git git = new Git(new FileRepository(localPath + "/.git"));
		// 提交代码
		CommitCommand commitCommand = git.commit();
		commitCommand.setMessage("cloudblock-commit-" + DateUtils.newTimestamp()).call();

		System.out.println("commit成功");
	}

	/**
	 * 拉取远程仓库内容到本地
	 */

	public static void Pull(String localPath, String remote, String username, String password)
			throws IOException, GitAPIException {

		UsernamePasswordCredentialsProvider usernamePasswordCredentialsProvider = new UsernamePasswordCredentialsProvider(
				username, password);
		// git仓库地址
		Git git = new Git(new FileRepository(localPath + "/.git"));

		if (null != username && !"".equals(username)) {
			git.pull().setRemote(remote).setRemoteBranchName("master")
					.setCredentialsProvider(usernamePasswordCredentialsProvider).call();

		} else {
			git.pull().setRemote(remote).setRemoteBranchName("master").call();

		}

		System.out.println("拉取项目成功");

	}

	/**
	 * push本地代码到远程仓库地址
	 */

	public static void Push(String localPath, String remote, String tag, String username, String password)
			throws IOException, JGitInternalException, GitAPIException {

		UsernamePasswordCredentialsProvider usernamePasswordCredentialsProvider = new UsernamePasswordCredentialsProvider(
				username, password);
		// git仓库地址
		Git git = new Git(new FileRepository(localPath + "/.git"));

		PushCommand push = git.push();
		if (null != tag && !"".equals(tag)) {
			if (null != username && !"".equals(username)) {
				push.setRemote(remote).add(tag).setCredentialsProvider(usernamePasswordCredentialsProvider).call();

			} else {
				push.setRemote(remote).add(tag).call();

			}
 
		} else {
			if (null != username && !"".equals(username)) {
				push.setRemote(remote).setCredentialsProvider(usernamePasswordCredentialsProvider).call();

			} else {
				push.setRemote(remote).call();

			}

		}

		System.out.println("推送项目成功");

		System.out.print(git.log());

	}

	public static void main(String[] args) {

		// 拉取远程项目，在本地创建

		// try {
		// Clone("https://github.com/JUSTForTTY/cloudblock_blank.git",
		// "I:\\git\\gitProject", "", "");
		// } catch (IOException | GitAPIException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// 本地项目关联新远程
		//
		// try {
		// remoteNewOrigin("I:\\git\\gitProject",
		// "https://gitlab.com/ttyblock/testproject.git","newOrigin", "ttyblock",
		// "18020285665");
		// } catch (JGitInternalException | IOException | GitAPIException |
		// URISyntaxException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// 拉取项目

		// try {
		// Pull("I:\\git\\gitProject", "newOrigin", "ttyblock", "18020285665");
		// } catch (IOException | GitAPIException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// // 添加文件
		//
		// try {
		// Add("I:\\git\\gitProject");
		// } catch (IOException | GitAPIException e2) {
		// // TODO Auto-generated catch block
		// e2.printStackTrace();
		// }
		//
		// //提交项目
		//
		// try {
		// Commit("I:\\git\\gitProject");
		// } catch (JGitInternalException | IOException | GitAPIException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		//
		// //推送远程

		// try {
		// Push("I:\\git\\gitProject", "newOrigin","tty", "ttyblock", "18020285665");
		// } catch (JGitInternalException | IOException | GitAPIException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		// try {
		// AddTag("I:\\git\\gitProject","tty");
		// } catch (IOException | GitAPIException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

	}
}
