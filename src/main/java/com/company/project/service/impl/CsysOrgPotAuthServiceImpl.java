package com.company.project.service.impl;

import com.company.project.outer.dao.CsysOrgPotAuthMapper;
import com.company.project.outer.model.CsysOrgPotAuth;
import com.company.project.service.CsysOrgPotAuthService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysOrgPotAuthServiceImpl extends AbstractService<CsysOrgPotAuth> implements CsysOrgPotAuthService {
    @Resource
    private CsysOrgPotAuthMapper csysOrgPotAuthMapper;

}
