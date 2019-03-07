package com.company.project.service.impl;

import com.company.project.dao.CySysBaseUserMapper;
import com.company.project.model.CySysBaseUser;
import com.company.project.service.CySysBaseUserService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/29.
 */
@Service
@Transactional
public class CySysBaseUserServiceImpl extends AbstractService<CySysBaseUser> implements CySysBaseUserService {
    @Resource
    private CySysBaseUserMapper cySysBaseUserMapper;

}
