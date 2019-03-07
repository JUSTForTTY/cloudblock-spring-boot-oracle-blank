package ${basePackage}.biz.impl;
${@ImportPackage}

/**
 * Created by ${author} on ${date}.
 */
@Component
@Transactional
public class ${pageNameUpperCamel}BizImpl implements ${pageNameUpperCamel}Biz {

	private final Log logger = LogFactory.getLog(getClass());
	
${@Resource}

${@Body}
	
}
