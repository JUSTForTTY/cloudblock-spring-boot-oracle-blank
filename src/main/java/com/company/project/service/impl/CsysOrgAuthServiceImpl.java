package com.company.project.service.impl;

import com.company.project.service.CsysOrgAuthService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysOrgAuthMapper;
import com.company.project.model.CsysOrgAuth;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysOrgAuthServiceImpl extends AbstractService<CsysOrgAuth> implements CsysOrgAuthService {
    @Resource
    private CsysOrgAuthMapper csysOrgAuthMapper;

}
