package com.company.project.service.impl;

import com.company.project.outer.dao.CsysTrsLogMapper;
import com.company.project.outer.model.CsysTrsLog;
import com.company.project.service.CsysTrsLogService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/24.
 */
@Service
@Transactional
public class CsysTrsLogServiceImpl extends AbstractService<CsysTrsLog> implements CsysTrsLogService {
    @Resource
    private CsysTrsLogMapper csysTrsLogMapper;

}
