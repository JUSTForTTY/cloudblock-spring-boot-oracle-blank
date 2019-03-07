package com.company.project.service.impl;

import com.company.project.outer.dao.CsysWorkflowRunMapper;
import com.company.project.outer.model.CsysWorkflowRun;
import com.company.project.service.CsysWorkflowRunService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Service
@Transactional
public class CsysWorkflowRunServiceImpl extends AbstractService<CsysWorkflowRun> implements CsysWorkflowRunService {
    @Resource
    private CsysWorkflowRunMapper csysWorkflowRunMapper;

}
