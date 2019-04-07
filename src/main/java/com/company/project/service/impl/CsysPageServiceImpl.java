package com.company.project.service.impl;

import com.company.project.service.CsysPageService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysPageMapper;
import com.company.project.model.CsysPage;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPageServiceImpl extends AbstractService<CsysPage> implements CsysPageService {
    @Resource
    private CsysPageMapper csysPageMapper;

}
