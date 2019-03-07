package com.company.project.service.impl;

import com.company.project.outer.dao.CsysTrsLogPamMapper;
import com.company.project.outer.model.CsysTrsLogPam;
import com.company.project.service.CsysTrsLogPamService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysTrsLogPamServiceImpl extends AbstractService<CsysTrsLogPam> implements CsysTrsLogPamService {
    @Resource
    private CsysTrsLogPamMapper csysTrsLogPamMapper;

}
