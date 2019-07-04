package com.company.project.service.impl;

import com.company.project.dao.CsysTrsRuleMapper;
import com.company.project.model.CsysTrsRule;
import com.company.project.service.CsysTrsRuleService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Service
@Transactional
public class CsysTrsRuleServiceImpl extends AbstractService<CsysTrsRule> implements CsysTrsRuleService {
    @Resource
    private CsysTrsRuleMapper csysTrsRuleMapper;

}
