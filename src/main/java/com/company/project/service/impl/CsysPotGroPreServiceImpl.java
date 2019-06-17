package com.company.project.service.impl;

import com.company.project.dao.CsysPotGroPreMapper;
import com.company.project.model.CsysPotGroPre;
import com.company.project.service.CsysPotGroPreService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Service
@Transactional
public class CsysPotGroPreServiceImpl extends AbstractService<CsysPotGroPre> implements CsysPotGroPreService {
    @Resource
    private CsysPotGroPreMapper csysPotGroPreMapper;

}
