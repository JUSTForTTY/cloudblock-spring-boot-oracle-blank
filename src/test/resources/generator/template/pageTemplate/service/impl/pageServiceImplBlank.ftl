package ${basePackage}.service.impl;
import com.company.project.outer.dao.SystemMapper;
${@ImportPackage}

/**
 * Created by ${author} on ${date}.
 */
@Component
@Transactional
public class ${pageNameUpperCamel}ServiceImpl implements ${pageNameUpperCamel}Service {
	
	private final Log logger = LogFactory.getLog(getClass());
	
	@Resource
	private SystemMapper systemMapper;	
	
${@Resource}

${@Body}
	
}
