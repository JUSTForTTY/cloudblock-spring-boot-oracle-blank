package com.company.project.service.impl;

import com.company.project.service.CsysExcelImportViewService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysExcelImportViewMapper;
import com.company.project.model.CsysExcelImportView;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/03/05.
 */
@Service
@Transactional
public class CsysExcelImportViewServiceImpl extends AbstractService<CsysExcelImportView> implements CsysExcelImportViewService {
    @Resource
    private CsysExcelImportViewMapper csysExcelImportViewMapper;

}
