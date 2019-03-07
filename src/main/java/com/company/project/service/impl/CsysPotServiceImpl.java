package com.company.project.service.impl;

import com.company.project.outer.dao.CsysPotMapper;
import com.company.project.outer.model.CsysPot;
import com.company.project.service.CsysPotService;
import com.company.project.core.service.AbstractService;
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
