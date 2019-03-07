package com.company.project.service.impl;

import com.company.project.outer.dao.CsysPotPublicMapper;
import com.company.project.outer.model.CsysPotPublic;
import com.company.project.service.CsysPotPublicService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPotPublicServiceImpl extends AbstractService<CsysPotPublic> implements CsysPotPublicService {
    @Resource
    private CsysPotPublicMapper csysPotPublicMapper;

}
