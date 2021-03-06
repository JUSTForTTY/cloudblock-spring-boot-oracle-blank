package com.company.project.service.impl;

import com.company.project.service.CsysViewExplainService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysViewExplainMapper;
import com.company.project.model.CsysViewExplain;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysViewExplainServiceImpl extends AbstractService<CsysViewExplain> implements CsysViewExplainService {
    @Resource
    private CsysViewExplainMapper csysViewExplainMapper;

}
