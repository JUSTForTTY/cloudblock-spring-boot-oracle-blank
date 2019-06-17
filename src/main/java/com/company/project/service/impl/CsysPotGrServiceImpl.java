package com.company.project.service.impl;

import com.company.project.dao.CsysPotGrMapper;
import com.company.project.model.CsysPotGr;
import com.company.project.service.CsysPotGrService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Service
@Transactional
public class CsysPotGrServiceImpl extends AbstractService<CsysPotGr> implements CsysPotGrService {
    @Resource
    private CsysPotGrMapper csysPotGrMapper;

}
