package com.company.project.biz.impl;

import com.company.project.service.CommonService;
import com.company.project.service.CsysExcelImportViewService;
import com.company.project.biz.CsysExcelImportViewBiz;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Condition;
import com.company.project.core.utils.DateUtils;
import com.company.project.model.CsysExcelImportView;
import com.company.project.model.CsysUserView;

import java.util.List;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import javax.annotation.Resource;

/**
 * Created by tty on 2019/03/05.
 */
@Component
@Transactional
public class CsysExcelImportViewBizImpl implements CsysExcelImportViewBiz {
	@Resource
	private CsysExcelImportViewService csysExcelImportViewService;
	@Resource
	private CommonService commonService;

	public CsysExcelImportView getDataSettings(String id) {

		CsysExcelImportView csysExcelImportView = new CsysExcelImportView();

		return csysExcelImportViewService.selectOne(csysExcelImportView);

	}

	public List<CsysExcelImportView> getDataSettingsByCondition(CsysExcelImportView csysExcelImportView) {

		return csysExcelImportViewService.select(csysExcelImportView);

	}

	public PageInfo getPageDataSettings(Integer page, Integer size) {

		PageHelper.startPage(page, size);
		List<CsysExcelImportView> list = csysExcelImportViewService.findAll();
		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;

	}

	public PageInfo getPageDataSettingsByCondition(Integer page, Integer size, CsysUserView baseUserView,
			CsysExcelImportView csysExcelImportView) {

		PageHelper.startPage(page, size);
		List<CsysExcelImportView> list = csysExcelImportViewService.select(csysExcelImportView);
		PageInfo pageInfo = new PageInfo(list);

		return pageInfo;

	}

	public String insertDataSettings(CsysUserView baseUserView, CsysExcelImportView csysExcelImportView) {

		// 获取sequence
		String sequence = commonService.getSequence("CsysExcelImportView");
		csysExcelImportViewService.save(csysExcelImportView);

		return sequence;
	}

	public void updateDataSettings(CsysUserView baseUserView, CsysExcelImportView csysExcelImportView) {
		csysExcelImportViewService.update(csysExcelImportView);

	}

	public void deleteDataSettings(String ids) {

		String[] idsArray = ids.split(",");
		String newids = "";
		for (int i = 0; i < idsArray.length; i++) {

			if (i == idsArray.length - 1) {
				newids = newids + "'" + idsArray[i] + "'";
			} else {
				newids = newids + "'" + idsArray[i] + "',";
			}

		}

		csysExcelImportViewService.deleteByIds(newids);

	}

}
