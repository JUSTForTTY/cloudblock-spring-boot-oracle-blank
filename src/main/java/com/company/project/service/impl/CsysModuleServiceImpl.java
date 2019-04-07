package com.company.project.service.impl;

import com.company.project.service.CsysModuleService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysModuleMapper;
import com.company.project.model.CsysModule;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/28.
 */
@Service
@Transactional
public class CsysModuleServiceImpl extends AbstractService<CsysModule> implements CsysModuleService {
    @Resource
    private CsysModuleMapper csysModuleMapper;

}
