package com.company.project.service.impl;

import com.company.project.outer.dao.CsysUserMapper;
import com.company.project.outer.model.CsysUser;
import com.company.project.service.CsysUserService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysUserServiceImpl extends AbstractService<CsysUser> implements CsysUserService {
    @Resource
    private CsysUserMapper csysUserMapper;

}
