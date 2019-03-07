
${@ImportPackage}

@RestController
@RequestMapping("${baseRequestMapping}")
public class ${pageNameUpperCamel}Controller {

	private final Log logger = LogFactory.getLog(getClass());
			
${@Resource}

${@Body}
    
}
