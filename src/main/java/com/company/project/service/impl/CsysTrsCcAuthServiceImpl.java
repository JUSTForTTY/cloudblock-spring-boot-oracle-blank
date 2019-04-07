package com.company.project.service.impl;

import com.company.project.service.CsysTrsCcAuthService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysTrsCcAuthMapper;
import com.company.project.model.CsysTrsCcAuth;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysTrsCcAuthServiceImpl extends AbstractService<CsysTrsCcAuth> implements CsysTrsCcAuthService {
    @Resource
    private CsysTrsCcAuthMapper csysTrsCcAuthMapper;

}
