package com.company.project.service.impl;

import com.company.project.outer.dao.CsysUserRoleMapper;
import com.company.project.outer.model.CsysUserRole;
import com.company.project.service.CsysUserRoleService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysUserRoleServiceImpl extends AbstractService<CsysUserRole> implements CsysUserRoleService {
    @Resource
    private CsysUserRoleMapper csysUserRoleMapper;

}
