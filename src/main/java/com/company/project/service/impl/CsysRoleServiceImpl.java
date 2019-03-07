package com.company.project.service.impl;

import com.company.project.outer.dao.CsysRoleMapper;
import com.company.project.outer.model.CsysRole;
import com.company.project.service.CsysRoleService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/12.
 */
@Service
@Transactional
public class CsysRoleServiceImpl extends AbstractService<CsysRole> implements CsysRoleService {
    @Resource
    private CsysRoleMapper csysRoleMapper;

}
