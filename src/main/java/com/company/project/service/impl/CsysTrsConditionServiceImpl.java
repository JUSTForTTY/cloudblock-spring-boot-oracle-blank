package com.company.project.service.impl;

import com.company.project.service.CsysTrsConditionService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysTrsConditionMapper;
import com.company.project.model.CsysTrsCondition;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysTrsConditionServiceImpl extends AbstractService<CsysTrsCondition> implements CsysTrsConditionService {
    @Resource
    private CsysTrsConditionMapper csysTrsConditionMapper;

}
