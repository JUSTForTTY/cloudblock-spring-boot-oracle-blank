package com.company.project.service.impl;

import com.company.project.service.CsysUserViewService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysUserViewMapper;
import com.company.project.model.CsysUserView;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysUserViewServiceImpl extends AbstractService<CsysUserView> implements CsysUserViewService {
    @Resource
    private CsysUserViewMapper csysUserViewMapper;

}
