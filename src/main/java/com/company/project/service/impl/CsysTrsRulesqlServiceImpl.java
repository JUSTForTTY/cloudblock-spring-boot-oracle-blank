package com.company.project.service.impl;

import com.company.project.dao.CsysTrsRulesqlMapper;
import com.company.project.model.CsysTrsRulesql;
import com.company.project.service.CsysTrsRulesqlService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Service
@Transactional
public class CsysTrsRulesqlServiceImpl extends AbstractService<CsysTrsRulesql> implements CsysTrsRulesqlService {
    @Resource
    private CsysTrsRulesqlMapper csysTrsRulesqlMapper;

}
