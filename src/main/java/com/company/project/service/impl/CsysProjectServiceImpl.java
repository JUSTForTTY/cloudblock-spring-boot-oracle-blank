package com.company.project.service.impl;

import com.company.project.outer.dao.CsysProjectMapper;
import com.company.project.outer.model.CsysProject;
import com.company.project.service.CsysProjectService;
import com.company.project.core.service.AbstractService;
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
