package com.company.project.service.impl;

import com.company.project.outer.dao.CsysExcelImportMapper;
import com.company.project.outer.model.CsysExcelImport;
import com.company.project.service.CsysExcelImportService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysExcelImportServiceImpl extends AbstractService<CsysExcelImport> implements CsysExcelImportService {
    @Resource
    private CsysExcelImportMapper csysExcelImportMapper;

}
