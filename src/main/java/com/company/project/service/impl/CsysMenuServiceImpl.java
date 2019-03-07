package com.company.project.service.impl;

import com.company.project.outer.dao.CsysMenuMapper;
import com.company.project.outer.model.CsysMenu;
import com.company.project.service.CsysMenuService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysMenuServiceImpl extends AbstractService<CsysMenu> implements CsysMenuService {
    @Resource
    private CsysMenuMapper csysMenuMapper;

}
