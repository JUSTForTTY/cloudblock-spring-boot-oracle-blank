package com.company.project.core.utils;

/**
 * 
 * @author tty
 * @说明 生成地址获取
 *
 */
public class BuildUrlUtils {
	private static final String configUrl = "build_block.properties";

	public static final String testRoutingModuleUrl = GetPropertiesValue.getValue(configUrl, "test.routing.module.url");

	public static final String testRoutingModuleTempUrl = GetPropertiesValue.getValue(configUrl,
			"test.routing.module.temp.url");

	public static final String buildfileBatUrl = GetPropertiesValue.getValue(configUrl, "buildfile.bat.url");

	public static final String buildfileBatCMDUrl = GetPropertiesValue.getValue(configUrl, "buildfile.bat.cmd.url");

	public static final String buildProjectBatUrl = GetPropertiesValue.getValue(configUrl, "buildproject.bat.url");

	public static final String copyDistBatUrl = GetPropertiesValue.getValue(configUrl, "copydist.bat.url");

	public static final String buildProjectBatCMDUrl = GetPropertiesValue.getValue(configUrl,
			"buildproject.bat.cmd.url");

	public static final String buildfileVbsUrl = GetPropertiesValue.getValue(configUrl, "buildfile.vbs.url");

	public static final String buildfileVbsCMDUrl = GetPropertiesValue.getValue(configUrl, "buildfile.vbs.cmd.url");

	public static final String AngularPackageRootUrl = GetPropertiesValue.getValue(configUrl,
			"angular.package.root.url");

	public static final String AngularPackageTestUrl = GetPropertiesValue.getValue(configUrl,
			"angular.package.test.url");

	public static final String AngularPackageMenuUrl = GetPropertiesValue.getValue(configUrl,
			"angular.package.menu.url");

	public static final String ProjectUrl = GetPropertiesValue.getValue(configUrl, "project.url");

	public static final String ProjectServer = GetPropertiesValue.getValue(configUrl, "project.server");

	public static final String cloneFrontProjectBat = GetPropertiesValue.getValue(configUrl,
			"cloneFrontProject.bat.url");

	public static final String cloneBackProjectBat = GetPropertiesValue.getValue(configUrl, "cloneBackProject.bat.url");

	public static final String moduleGitFrontProject = GetPropertiesValue.getValue(configUrl,
			"moduleGitFrontProject.git.server");

	public static final String moduleGitBackProject = GetPropertiesValue.getValue(configUrl,
			"moduleGitBackProject.git.server");

	public static final String gitFrontProject = GetPropertiesValue.getValue(configUrl, "gitFrontProject.git.server");

	public static final String gitBackProject = GetPropertiesValue.getValue(configUrl, "gitBackProject.git.server");

	public static final String gitFrontProjectName = GetPropertiesValue.getValue(configUrl, "gitFrontProjectName");

	public static final String gitBackProjectName = GetPropertiesValue.getValue(configUrl, "gitBackProjectName");

	public static final String frontProjectPositon = GetPropertiesValue.getValue(configUrl, "frontProject.positon");

	public static final String backProjectPositon = GetPropertiesValue.getValue(configUrl, "backProject.positon");

	public static final String serverCodePosition = GetPropertiesValue.getValue(configUrl, "serveCode.positon");

	public static final String gitProjectUsername = GetPropertiesValue.getValue(configUrl, "gitProject.username");

	public static final String gitProjectPassword = GetPropertiesValue.getValue(configUrl, "gitProject.password");
	
	public static final String fileUploadPath = GetPropertiesValue.getValue(configUrl, "fileUpload.position");

	public static final String projectDomainName = GetPropertiesValue.getValue(configUrl, "projectDomainName");
}
