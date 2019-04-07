package com.company.project.service.impl;

import com.company.project.service.CsysMenuPageViewService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysMenuPageViewMapper;
import com.company.project.model.CsysMenuPageView;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysMenuPageViewServiceImpl extends AbstractService<CsysMenuPageView> implements CsysMenuPageViewService {
    @Resource
    private CsysMenuPageViewMapper csysMenuPageViewMapper;

}
