package com.company.project.service.impl;

import com.company.project.service.CsysMenuAuthViewService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysMenuAuthViewMapper;
import com.company.project.model.CsysMenuAuthView;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Service
@Transactional
public class CsysMenuAuthViewServiceImpl extends AbstractService<CsysMenuAuthView> implements CsysMenuAuthViewService {
    @Resource
    private CsysMenuAuthViewMapper csysMenuAuthViewMapper;

}
