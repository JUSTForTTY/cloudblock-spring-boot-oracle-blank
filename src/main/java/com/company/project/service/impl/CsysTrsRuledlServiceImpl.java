package com.company.project.service.impl;

import com.company.project.dao.CsysTrsRuledlMapper;
import com.company.project.model.CsysTrsRuledl;
import com.company.project.service.CsysTrsRuledlService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Service
@Transactional
public class CsysTrsRuledlServiceImpl extends AbstractService<CsysTrsRuledl> implements CsysTrsRuledlService {
    @Resource
    private CsysTrsRuledlMapper csysTrsRuledlMapper;

}
