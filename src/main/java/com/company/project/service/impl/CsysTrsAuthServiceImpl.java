package com.company.project.service.impl;

import com.company.project.service.CsysTrsAuthService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysTrsAuthMapper;
import com.company.project.model.CsysTrsAuth;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysTrsAuthServiceImpl extends AbstractService<CsysTrsAuth> implements CsysTrsAuthService {
    @Resource
    private CsysTrsAuthMapper csysTrsAuthMapper;

}
