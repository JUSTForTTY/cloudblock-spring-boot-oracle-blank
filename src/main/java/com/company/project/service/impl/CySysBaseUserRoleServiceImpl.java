package com.company.project.service.impl;

import com.company.project.dao.CySysBaseUserRoleMapper;
import com.company.project.model.CySysBaseUserRole;
import com.company.project.service.CySysBaseUserRoleService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/27.
 */
@Service
@Transactional
public class CySysBaseUserRoleServiceImpl extends AbstractService<CySysBaseUserRole> implements CySysBaseUserRoleService {
    @Resource
    private CySysBaseUserRoleMapper cySysBaseUserRoleMapper;

}
