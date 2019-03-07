package ${basePackage}.web;

import ${basePackage}.core.result.Result;
import ${basePackage}.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import ${basePackage}.model.${modelNameUpperCamel};
import com.company.project.outer.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import ${basePackage}.biz.${modelNameUpperCamel}Biz;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import java.util.List;
import java.util.HashMap;
import java.util.Map;



/**
* Created by ${author} on ${date}.
*/
@RestController
@RequestMapping("${baseRequestMapping}")
public class ${modelNameUpperCamel}Controller {
	private final Log logger = LogFactory.getLog(getClass());
	
    @Resource
    private ${modelNameUpperCamel}Biz ${modelNameLowerCamel}Biz;
    
    @Resource
	private AuthLoginBiz authloginBiz;
    
    @Resource
	private AuthUtils authUtils;
  
}
