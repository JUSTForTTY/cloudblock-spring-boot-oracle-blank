package com.company.project.service.impl;

import com.company.project.outer.dao.CsysTrsPageMapper;
import com.company.project.outer.model.CsysTrsPage;
import com.company.project.service.CsysTrsPageService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysTrsPageServiceImpl extends AbstractService<CsysTrsPage> implements CsysTrsPageService {
    @Resource
    private CsysTrsPageMapper csysTrsPageMapper;

}
