import com.google.common.base.CaseFormat;

import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

import static com.company.project.core.constant.ProjectConstant.*;

/**
 * 代码生成器，根据数据表名称生成对应的Model、Mapper、Service、Controller简化开发。
 */
public class CodeGeneratorForPage {

	private static final String RESOURCES_PATH = "/src/main/resources";// 资源文件路径

	private static final String PACKAGE_PATH_BIZ = packageConvertPath(BIZ_PACKAGE);// 生成的Biz存放路径
	private static final String PACKAGE_PATH_BIZ_IMPL = packageConvertPath(BIZ_IMPL_PACKAGE);// 生成的Biz实现存放路径
	private static final String PACKAGE_PATH_SERVICE = packageConvertPath(SERVICE_PACKAGE);// 生成的Service存放路径
	private static final String PACKAGE_PATH_SERVICE_IMPL = packageConvertPath(SERVICE_IMPL_PACKAGE);// 生成的Service实现存放路径
	private static final String PACKAGE_PATH_CONTROLLER = packageConvertPath(CONTROLLER_PACKAGE);// 生成的Controller存放路径
	private static final String DATE = new SimpleDateFormat("yyyy/MM/dd").format(new Date());// @date
	private static final String PROJECT_PATH = System.getProperty("user.dir");// 项目在硬盘上的基础路径

	public static void main(String[] args) {
		genCode("page1");
		// genCode("输入表名","输入自定义Model名称");
	}

	/**
	 * 通过数据表名称生成代码，Model 名称通过解析数据表名称获得，下划线转大驼峰的形式。 如输入表名称 "t_user_detail" 将生成
	 * TUserDetail、TUserDetailMapper、TUserDetailService ...
	 * 
	 * @param tableNames
	 *            数据表名称...
	 */
	public static void genCode(String... tableNames) {
		for (String tableName : tableNames) {
			genCode(tableName, null);
		}
	}

	/**
	 * 通过数据表名称，和自定义的 Model 名称生成代码 如输入表名称 "t_user_detail" 和自定义的 Model 名称 "User" 将生成
	 * User、UserMapper、UserService ...
	 * 
	 * @param tableName
	 *            数据表名称
	 * @param modelName
	 *            自定义的 Model 名称
	 */
	public static void genCode(String pageName) {
		// 首字母大写页面名称
		String pageNameUpperCamel = convertUpperCamel(pageName);
		// 首字母小写页面名称
		String pageNameLowerCamel = convertLowerCamel(pageName);
		Map<String, Object> data = new HashMap<>();
		data.put("date", DATE);
		data.put("author", "sxs");
		data.put("baseRequestMapping", pageName);
		data.put("pageNameUpperCamel", pageNameUpperCamel);
		data.put("pageNameLowerCamel", pageNameLowerCamel);
		data.put("basePackage", BASE_PACKAGE);

		String projectPath = System.getProperty("user.dir");// 项目在硬盘上的基础路径
		String tempFilePath = projectPath + "/src/test/resources/generator/template";// 模板位置

		// 页面模板
		String pageTempPath = "/pageTemplate";
		String pageTempName = "page";

		// 积木模板
		String blockTempName = "table01";
		Map<String, String> blockMap = new HashMap<>();
		blockMap.put("blockPath", "/blockTemplate/table/table01");
		blockMap.put("blockName", blockTempName);
		blockMap.put("blockUpperName", convertUpperCamel(blockTempName));
		List<Map<String, String>> blockList = new ArrayList<>();
		blockList.add(blockMap);

		// 第一步：生成页面Controller
		generateCode(pageName, "controller", "Controller", PACKAGE_PATH_CONTROLLER, data, tempFilePath, pageTempPath,
				pageTempName, blockList);

		// 第二步：生成页面Biz
		generateCode(pageName, "biz", "Biz", PACKAGE_PATH_BIZ, data, tempFilePath, pageTempPath, pageTempName,
				blockList);

		// 第三步：生成页面BizImpl
		generateCode(pageName, "biz/impl", "BizImpl", PACKAGE_PATH_BIZ_IMPL, data, tempFilePath, pageTempPath,
				pageTempName, blockList);

		// 第四步：生成页面Service
		generateCode(pageName, "service", "Service", PACKAGE_PATH_SERVICE, data, tempFilePath, pageTempPath,
				pageTempName, blockList);

		// 第五步：生成页面ServiceImpl
		generateCode(pageName, "service/impl", "ServiceImpl", PACKAGE_PATH_SERVICE_IMPL, data, tempFilePath,
				pageTempPath, pageTempName, blockList);
	}

	public static void generateCode(String tableName, String modulePackage, String moduleUpperName, String packagePath,
			Map<String, Object> data, String tempFilePath, String pageTempPath, String pageTempName,
			List<Map<String, String>> blockList) {
		try {
			freemarker.template.Configuration cfg = getConfiguration(tempFilePath);
			// 读取文件
			FileReader reader;
			BufferedReader br;
			String line;
			StringBuilder addLine = new StringBuilder();
			int count = 0;
			String blockPath;

			// 页面前缀
			String pagePrefix = pageTempPath + "/" + modulePackage + "/" + pageTempName + moduleUpperName;

			// 第一步：开始组装页面Import模板
			Writer importWriter = new StringWriter();
			Template importTemplate = cfg.getTemplate(pagePrefix + "Import.ftl");
			importTemplate.process(data, importWriter);
			for (Map<String, String> map : blockList) {
				// 接着组装所有页面积木Import模板
				blockPath = tempFilePath + map.get("blockPath") + "/" + modulePackage + "/" + map.get("blockName")
						+ moduleUpperName + "Import.ftl";
				if (new File(blockPath).exists()) {
					reader = new FileReader(blockPath);
					br = new BufferedReader(reader);
					importWriter.append("\n");
					// 逐行读取数据
					while ((line = br.readLine()) != null) {
						// 判断是否存在，若不存在则进行拼接
						if (importWriter.toString().indexOf(line) == -1)
							importWriter.append("\n" + line);
					}
				}
			}

			// 注意biz和service层无需引用Resource或者Autowired等注解
			if (!"biz".equals(modulePackage) && !"service".equals(modulePackage)) {
				// 第二步：开始组装页面Resource模板
				Writer resourceWriter = new StringWriter();
				Template resourceTemplate = cfg.getTemplate(pagePrefix + "Resource.ftl");
				resourceTemplate.process(data, resourceWriter);

				for (Map<String, String> map : blockList) {
					// 接着组装所有页面积木resource模板
					blockPath = tempFilePath + map.get("blockPath") + "/" + modulePackage + "/" + map.get("blockName")
							+ moduleUpperName + "Resource.ftl";
					if (new File(blockPath).exists()) {
						reader = new FileReader(blockPath);
						br = new BufferedReader(reader);
						importWriter.append("\n");
						// 逐行读取数据
						while ((line = br.readLine()) != null) {
							// 判断是否包含字符
							if (Pattern.compile("[a-zA-z]").matcher(line).find()) {
								// 拼接字符
								addLine.append(line + "\n");
								if (count % 2 == 1) {
									// 判断是否存在，若不存在则进行拼接
									if (resourceWriter.toString().indexOf(addLine.toString()) == -1)
										System.out.println(addLine);
									resourceWriter.append("\n" + addLine);
									// 初始化字符
									addLine = new StringBuilder();
								}
								count++;
							}
						}
					}
				}
				data.put("@Resource", resourceWriter);
			}

			// 第三步：开始组装页面Boy模板
			Writer bodyWriter = new StringWriter();
			Template bodyTemplate = cfg.getTemplate(pagePrefix + "Body.ftl");
			bodyTemplate.process(data, bodyWriter);

			for (Map<String, String> map : blockList) {
				data.put("@BlockCode", map.get("blockUpperName"));
				blockPath = map.get("blockPath") + "/" + modulePackage + "/" + map.get("blockName") + moduleUpperName
						+ "Body.ftl";
				if (new File(tempFilePath + blockPath).exists()) {
					// 接着组装所有页面积木body模板
					Template blockBodyTemplate = cfg.getTemplate(blockPath);
					blockBodyTemplate.process(data, bodyWriter);
				}
			}
			// 替换
			data.put("@ImportPackage", importWriter);
			data.put("@Body", bodyWriter);

			// 最后一步：开始组装页面空白模板
			Writer controlWriter = new StringWriter();
			Template temp = cfg.getTemplate(pagePrefix + "Blank.ftl");
			temp.process(data, controlWriter);

			File file = new File(PROJECT_PATH + JAVA_PATH + packagePath + data.get("pageNameUpperCamel")
					+ moduleUpperName + ".java");
			if (!file.getParentFile().exists()) {
				file.getParentFile().mkdirs();
			}

			Writer fileWriter = new FileWriter(file);
			fileWriter.append(controlWriter.toString());
			fileWriter.flush();
			System.out.println("生成成功");
		} catch (Exception e) {
			throw new RuntimeException("生成失败", e);
		}

	}

	private static freemarker.template.Configuration getConfiguration(String pageTempPath) throws IOException {
		freemarker.template.Configuration cfg = new freemarker.template.Configuration(
				freemarker.template.Configuration.VERSION_2_3_23);
		cfg.setDirectoryForTemplateLoading(new File(pageTempPath));
		cfg.setDefaultEncoding("UTF-8");
		cfg.setTemplateExceptionHandler(TemplateExceptionHandler.IGNORE_HANDLER);
		return cfg;
	}

	private static String convertLowerCamel(String tableName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, tableName.toLowerCase());
	}

	private static String convertUpperCamel(String tableName) {
		return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());

	}

	private static String tableNameConvertMappingPath(String tableName) {
		tableName = tableName.toLowerCase();// 兼容使用大写的表名
		return "/" + (tableName.contains("_") ? tableName.replaceAll("_", "") : tableName);
	}

	private static String modelNameConvertMappingPath(String modelName) {
		String tableName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, modelName);
		return tableNameConvertMappingPath(tableName);
	}

	private static String packageConvertPath(String packageName) {
		return String.format("/%s/", packageName.contains(".") ? packageName.replaceAll("\\.", "/") : packageName);
	}

}
