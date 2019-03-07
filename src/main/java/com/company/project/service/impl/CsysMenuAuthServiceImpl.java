package com.company.project.service.impl;

import com.company.project.outer.dao.CsysMenuAuthMapper;
import com.company.project.outer.model.CsysMenuAuth;
import com.company.project.service.CsysMenuAuthService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/14.
 */
@Service
@Transactional
public class CsysMenuAuthServiceImpl extends AbstractService<CsysMenuAuth> implements CsysMenuAuthService {
    @Resource
    private CsysMenuAuthMapper csysMenuAuthMapper;

}
