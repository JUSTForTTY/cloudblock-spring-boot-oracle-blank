package com.company.project.service.impl;

import com.company.project.service.CsysPageLayoutService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysPageLayoutMapper;
import com.company.project.model.CsysPageLayout;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPageLayoutServiceImpl extends AbstractService<CsysPageLayout> implements CsysPageLayoutService {
    @Resource
    private CsysPageLayoutMapper csysPageLayoutMapper;

}
