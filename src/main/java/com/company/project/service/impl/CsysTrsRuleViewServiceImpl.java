package com.company.project.service.impl;

import com.company.project.dao.CsysTrsRuleViewMapper;
import com.company.project.model.CsysTrsRuleView;
import com.company.project.service.CsysTrsRuleViewService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Service
@Transactional
public class CsysTrsRuleViewServiceImpl extends AbstractService<CsysTrsRuleView> implements CsysTrsRuleViewService {
    @Resource
    private CsysTrsRuleViewMapper csysTrsRuleViewMapper;

}
