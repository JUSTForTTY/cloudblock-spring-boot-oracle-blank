package com.company.project.service.impl;

import com.company.project.service.CsysProjectService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysProjectMapper;
import com.company.project.model.CsysProject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysProjectServiceImpl extends AbstractService<CsysProject> implements CsysProjectService {
    @Resource
    private CsysProjectMapper csysProjectMapper;

}
