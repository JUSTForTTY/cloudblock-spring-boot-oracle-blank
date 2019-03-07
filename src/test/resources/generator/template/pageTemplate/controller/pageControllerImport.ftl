/**
* Created by ${author} on ${date}.
*/
package ${basePackage}.web;
import ${basePackage}.core.result.Result;
import ${basePackage}.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.outer.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import ${basePackage}.biz.${pageNameUpperCamel}Biz;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;
import java.util.List;
import java.util.HashMap;
import java.util.Map;