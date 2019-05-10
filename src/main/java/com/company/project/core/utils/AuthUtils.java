package com.company.project.core.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.company.project.biz.AuthLoginBiz;
import com.company.project.biz.CsysUserBiz;
import com.company.project.model.CsysUser;
import com.company.project.model.CsysUserView;

import io.jsonwebtoken.Claims;



@Component
public class AuthUtils {
	private final Log logger = LogFactory.getLog(getClass());

	@Resource
	private AuthLoginBiz authloginBiz;
	@Resource
	private CsysUserBiz cySysBaseUserBiz;
	
	public Map<String,Object> doAuth(String token,String refreshtoken) {

		logger.info("token:------"+token);
		logger.info("refreshtoken:-----"+refreshtoken);
		Map<String,Object> map =new HashMap<String, Object>();
		
		// 验证授权信息
		Claims claims;
		// 默认无需重新更新
		boolean tokenRefreshFlag = false;
		//token状态
		boolean tokenFlag = true;
		
		//用户验证or实施验证
		
			claims = JWTUtil.parseJWT(token);

			
			//如果access_token 认证为空，判断refersh_token是否过期
			if(null==claims) {
				
				Claims Refreshclaims = JWTUtil.parseJWT(refreshtoken);
				
				if(null==Refreshclaims) {
				//refresh_token验证为空，登陆已过期
				tokenFlag=false;
					
				}else{
					
					// 获取用户信息
					/*--------------start 此段代码可优化成redis-----------------------*/
					CsysUserView CheckUserView = new CsysUserView();
					
					 CheckUserView.setCsysUserRefreshToken(refreshtoken);
					
					List<CsysUserView> CheckUserList = authloginBiz.getDataSettingsByCondition(CheckUserView);

					if(CheckUserList.size()>0) {
						CsysUserView currentCsysUserView=CheckUserList.get(0);
						token=currentCsysUserView.getCsysUserAccessToken();
						
						//进行二次校验access_token是否过期，防止异步调用产生错误
						Claims claimsAgain = JWTUtil.parseJWT(token);
						 
						if(null==claimsAgain) {
							//如果已经过期，则生成新token
							// refresh_token没有过期，重新生成新token
							try {
								token = JWTUtil.createJWT(currentCsysUserView.getCsysUserOpenId(),
										currentCsysUserView.getCsysUserUsername(), 1000 * 60 * 2);
							} catch (Exception e) {
								 
								e.printStackTrace();
							}


							// 存储token,refresh_token
							CsysUser baseUser = new CsysUser();

							baseUser.setCsysUserAccessToken(token);
							baseUser.setCsysUserRefreshToken(currentCsysUserView.getCsysUserRefreshToken());
							baseUser.setCsysUserId(currentCsysUserView.getCsysUserId());
							cySysBaseUserBiz.updateDataSettings(currentCsysUserView,baseUser);

							tokenRefreshFlag = true;
						}else {
							tokenRefreshFlag = true;
						}	
					}else {
						
						//refresh_token異常
						tokenFlag=false;
						
					}
					 
					/*--------------end 此段代码可优化成redis-----------------------*/
					
					 
				}
				
			}else {
				//登陆未过期
				
			}
			
			
		 
		map.put("token", token); 
		map.put("refreshtoken", refreshtoken);
		map.put("tokenRefreshFlag", tokenRefreshFlag);
		map.put("tokenFlag", tokenFlag);
		
		
		return map;
	}

}
