package com.company.project.web;

import com.company.project.core.result.Result;
import com.company.project.core.result.ResultGenerator;
import com.company.project.core.utils.AuthUtils;
import com.company.project.model.CsysOrgStruce;
import com.company.project.model.CsysUserView;
import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysOrgStruceBiz;
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
* Created by tty on 2019/01/23.
*/
@RestController
@RequestMapping("/csysorgstruce")
public class CsysOrgStruceController {
	private final Log logger = LogFactory.getLog(getClass());
	
    @Resource
    private CsysOrgStruceBiz csysOrgStruceBiz;
    
    @Resource
	private AuthLoginBiz authloginBiz;
    
    @Resource
	private AuthUtils authUtils;

    @PostMapping
    public Result insertSettingsData(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @RequestBody CsysOrgStruce csysOrgStruce) {
    
    	Map<String,String> param = new HashMap<>();
    	
    	/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
		try{
		
		//获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/
		
        String insertId=csysOrgStruceBiz.insertDataSettings(baseUserList.get(0),csysOrgStruce);
        
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
        return ResultGenerator.genSuccessResult(insertId,param);
        
        } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
        
        
    }

    @DeleteMapping("/{ids}")
    public Result delete(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @PathVariable String ids) {
    
   		 Map<String,String> param = new HashMap<>();
    	/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
		
		try{
		
        csysOrgStruceBiz.deleteDataSettings(ids);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
        return ResultGenerator.genSuccessResult(param);
        
        } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
    }

    @PutMapping
    public Result update(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @RequestBody CsysOrgStruce csysOrgStruce) {
    
    	Map<String,String> param = new HashMap<>();
    	/*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
		
		try{
		//获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/
		
        csysOrgStruceBiz.updateDataSettings(baseUserList.get(0),csysOrgStruce);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
        return ResultGenerator.genSuccessResult(param);
        
        } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
    }

    @GetMapping("/{id}")
    public Result detail(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @PathVariable String id) {
    
    	Map<String,String> param = new HashMap<>();
		 /*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
 		try{
 		
        CsysOrgStruce csysOrgStruce = csysOrgStruceBiz.getDataSettings(id);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
        return ResultGenerator.genSuccessResult(csysOrgStruce,param);
        
         } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
        
    }

  	@PostMapping("/condition")
    public Result detailByCondition(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @RequestBody CsysOrgStruce csysOrgStruce) {
    
    	Map<String,String> param = new HashMap<>();
		 /*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
 		try{
 		
        List<CsysOrgStruce> csysOrgStrucelst = csysOrgStruceBiz.getDataSettingsByCondition(csysOrgStruce);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
        return ResultGenerator.genSuccessResult(csysOrgStrucelst,param);
        
         } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
        
    }
    @GetMapping
    public Result list(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
    
    	Map<String,String> param = new HashMap<>();
        /*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
		
        
        try{
         PageInfo pageInfo=csysOrgStruceBiz.getPageDataSettings(page,size);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
         return ResultGenerator.genSuccessResult(pageInfo,param);
        
          } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
        
    }
    
    @PostMapping("/listCondition")
    public Result listByCondition(@RequestHeader(value = "access_token") String access_token,@RequestHeader(value = "refresh_token") String refresh_token,
    @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size,@RequestBody CsysOrgStruce csysOrgStruce) {
    
    	Map<String,String> param = new HashMap<>();
        /*---------------------------start 授权验证------------------------*/
		Map<String, Object> authMap = authUtils.doAuth(access_token,refresh_token);
		boolean tokenRefreshFlag = (boolean) authMap.get("tokenRefreshFlag");
		boolean tokenFlag = (boolean) authMap.get("tokenFlag");
		String token = authMap.get("token").toString();
		String refreshtoken=authMap.get("refreshtoken").toString();

		if (!tokenFlag) {
			/*
			 * return code: 401 access_token无效或已过期
			 */
			 return ResultGenerator.genUnauthorizedResult(param);

		}
		/*---------------------------end 授权验证------------------------*/
		//获取用户信息
		/*--------------start 此段代码可优化成redis-----------------------*/
			CsysUserView baseUserView = new CsysUserView();

			baseUserView.setCsysUserRefreshToken(refreshtoken);

			List<CsysUserView> baseUserList = authloginBiz.getDataSettingsByCondition(baseUserView);

		/*--------------end 此段代码可优化成redis-----------------------*/
        
        try{
         PageInfo pageInfo=csysOrgStruceBiz.getPageDataSettingsByCondition(page,size,baseUserList.get(0),csysOrgStruce);
        if(tokenRefreshFlag) {
        	param.put("access_token", token);
        	param.put("refresh_token", refreshtoken);
        	 
		}
         return ResultGenerator.genSuccessResult(pageInfo,param);
        
          } catch (Exception e) {
        
        return ResultGenerator.genServerErrorResult(param);
        
        }
        
    }
}
