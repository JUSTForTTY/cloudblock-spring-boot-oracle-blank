package ${basePackage}.biz.impl;

import com.company.project.service.CommonService;
import ${basePackage}.service.${modelNameUpperCamel}Service;
import ${basePackage}.biz.${modelNameUpperCamel}Biz;
import ${basePackage}.model.${modelNameUpperCamel};
import ${basePackage}.model.CsysUserView;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;


/**
 * Created by ${author} on ${date}.
 */
@Component
@Transactional
public class ${modelNameUpperCamel}BizImpl  implements ${modelNameUpperCamel}Biz {
    @Resource
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;
	@Resource
    private CommonService commonService;
    
	public ${modelNameUpperCamel} getDataSettings(String id){
	
		${modelNameUpperCamel} ${modelNameLowerCamel} = new ${modelNameUpperCamel}();
		${modelNameLowerCamel}.set${modelNameUpperCamel}Id(id);
   		${modelNameLowerCamel}.set${modelNameUpperCamel}IsDelete("0");
		 
		return ${modelNameLowerCamel}Service.selectOne(${modelNameLowerCamel});
		
	
	}
	public List<${modelNameUpperCamel}> getDataSettingsByCondition(${modelNameUpperCamel} ${modelNameLowerCamel}){
	
		 
   		${modelNameLowerCamel}.set${modelNameUpperCamel}IsDelete("0");
		return ${modelNameLowerCamel}Service.select(${modelNameLowerCamel});
	
	
	}
	public PageInfo getPageDataSettings(Integer page,Integer size){
	
	    PageHelper.startPage(page, size);
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.findAll();
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public PageInfo getPageDataSettingsByCondition(Integer page,Integer size,CsysUserView baseUserView,${modelNameUpperCamel} ${modelNameLowerCamel}){
	
		PageHelper.startPage(page, size);
		${modelNameLowerCamel}.set${modelNameUpperCamel}IsDelete("0");
        List<${modelNameUpperCamel}> list = ${modelNameLowerCamel}Service.select(${modelNameLowerCamel});
        PageInfo pageInfo = new PageInfo(list);
		
		return pageInfo;
	
	}
	public String insertDataSettings(CsysUserView baseUserView,${modelNameUpperCamel} ${modelNameLowerCamel}){
		
		//获取sequence
		String sequence=commonService.getSequence("${modelNameUpperCamel}");
		${modelNameLowerCamel}.set${modelNameUpperCamel}Id(sequence);
		${modelNameLowerCamel}.set${modelNameUpperCamel}CreateTime(DateUtils.newTimestamp());
		${modelNameLowerCamel}.set${modelNameUpperCamel}CreateUser(baseUserView.getCsysUserId());
		${modelNameLowerCamel}.set${modelNameUpperCamel}ModifyTime(DateUtils.newTimestamp());
		${modelNameLowerCamel}.set${modelNameUpperCamel}ModifyUser(baseUserView.getCsysUserId());
		${modelNameLowerCamel}.set${modelNameUpperCamel}IsDelete("0");
		${modelNameLowerCamel}Service.save(${modelNameLowerCamel});
		
		return sequence;
	}
	
 
	public void updateDataSettings(CsysUserView baseUserView,${modelNameUpperCamel} ${modelNameLowerCamel}){
		${modelNameLowerCamel}.set${modelNameUpperCamel}ModifyTime(DateUtils.newTimestamp());
		${modelNameLowerCamel}.set${modelNameUpperCamel}ModifyUser(baseUserView.getCsysUserId());
		${modelNameLowerCamel}Service.update(${modelNameLowerCamel});
	
	}
	
	 
	public void deleteDataSettings(String ids){
	
		String [] idsArray=ids.split(",");
		String newids="";
		for(int i=0;i<idsArray.length;i++) {
			
			if(i==idsArray.length-1) {
				newids=newids+"'"+idsArray[i]+"'";
			}else {
				newids=newids+"'"+idsArray[i]+"',";
			}
			 
		}
		
		${modelNameLowerCamel}Service.deleteByIds(newids);
	
	}

	
}
