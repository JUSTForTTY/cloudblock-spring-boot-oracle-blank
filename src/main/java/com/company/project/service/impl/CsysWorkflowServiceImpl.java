package com.company.project.service.impl;

import com.company.project.outer.dao.CsysWorkflowMapper;
import com.company.project.outer.model.CsysWorkflow;
import com.company.project.service.CsysWorkflowService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/25.
 */
@Service
@Transactional
public class CsysWorkflowServiceImpl extends AbstractService<CsysWorkflow> implements CsysWorkflowService {
    @Resource
    private CsysWorkflowMapper csysWorkflowMapper;

}
