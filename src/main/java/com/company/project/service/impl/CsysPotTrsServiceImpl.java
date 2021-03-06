package com.company.project.service.impl;

import com.company.project.service.CsysPotTrsService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysPotTrsMapper;
import com.company.project.model.CsysPotTrs;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Service
@Transactional
public class CsysPotTrsServiceImpl extends AbstractService<CsysPotTrs> implements CsysPotTrsService {
    @Resource
    private CsysPotTrsMapper csysPotTrsMapper;

}
