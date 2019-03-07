package com.company.project.core.utils;

/**
 * 
 * @author tty
 * @说明 生成地址获取
 *
 */
public class ProjectUtil {
	private static final String configUrl = "application.properties";

	public static final String projectIdPrefix = GetPropertiesValue.getValue(configUrl, "spring.projectPrefix");
}
