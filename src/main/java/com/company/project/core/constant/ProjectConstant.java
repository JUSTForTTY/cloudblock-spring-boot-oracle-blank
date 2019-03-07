package com.company.project.core.constant;

/**
 * 项目常量
 */
public final class ProjectConstant {
	public static final String JAVA_PATH = "/src/main/java"; // java文件路径
	public static final String BASE_PACKAGE = "com.company.project";// 项目基础包名称，根据自己公司的项目修改
	public static final String BASE_PACKAGE_OUTER = "com.company.project.outer";// 项目基础包名称，根据自己公司的项目修改
	public static final String BASE_PACKAGE_CUSTOMER = "com.company.project.customer";// 项目基础包名称，根据客户公司的项目修改
	public static final String BIZ_PACKAGE = BASE_PACKAGE + ".biz";// Biz所在包
	public static final String BIZ_IMPL_PACKAGE = BIZ_PACKAGE + ".impl";// BizImpl所在包
	public static final String MODEL_PACKAGE = BASE_PACKAGE + ".model";// Model所在包
	public static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";// Mapper所在包
	public static final String SERVICE_PACKAGE = BASE_PACKAGE + ".service";// Service所在包
	public static final String SERVICE_IMPL_PACKAGE = SERVICE_PACKAGE + ".impl";// ServiceImpl所在包
	public static final String CONTROLLER_PACKAGE = BASE_PACKAGE + ".web";// Controller所在包

	public static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.mapper.CommonMapper";// Mapper插件基础接口的完全限定名

	// 用户接口包
	public static final String USER_MODEL_PACKAGE = BASE_PACKAGE_OUTER + ".model";// Model所在包
	public static final String USER_MAPPER_PACKAGE = BASE_PACKAGE_OUTER + ".dao";// Mapper所在包
	public static final String USER_MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.mapper.MapperUser";// Mapper插件基础接口的完全限定名

	// 客户接口包
	public static final String CUSTOMER_MODEL_PACKAGE = BASE_PACKAGE_CUSTOMER + ".model";// Model所在包
	public static final String CUSTOMER_MAPPER_PACKAGE = BASE_PACKAGE_CUSTOMER + ".dao";// Mapper所在包
	public static final String CUSTOMER_MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".core.mapper.MapperUser";// Mapper插件基础接口的完全限定名

}
