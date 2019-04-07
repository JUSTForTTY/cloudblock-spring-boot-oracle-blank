package com.company.project.service.impl;

import com.company.project.service.CsysPotService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysPotMapper;
import com.company.project.model.CsysPot;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPotServiceImpl extends AbstractService<CsysPot> implements CsysPotService {
    @Resource
    private CsysPotMapper csysPotMapper;

}
