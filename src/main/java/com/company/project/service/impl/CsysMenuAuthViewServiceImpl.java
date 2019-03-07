package com.company.project.service.impl;

import com.company.project.outer.dao.CsysMenuAuthViewMapper;
import com.company.project.outer.model.CsysMenuAuthView;
import com.company.project.service.CsysMenuAuthViewService;
import com.company.project.core.service.AbstractService;
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
