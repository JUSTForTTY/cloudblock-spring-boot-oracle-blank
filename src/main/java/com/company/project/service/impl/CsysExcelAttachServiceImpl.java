package com.company.project.service.impl;

import com.company.project.service.CsysExcelAttachService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysExcelAttachMapper;
import com.company.project.model.CsysExcelAttach;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysExcelAttachServiceImpl extends AbstractService<CsysExcelAttach> implements CsysExcelAttachService {
    @Resource
    private CsysExcelAttachMapper csysExcelAttachMapper;

}
