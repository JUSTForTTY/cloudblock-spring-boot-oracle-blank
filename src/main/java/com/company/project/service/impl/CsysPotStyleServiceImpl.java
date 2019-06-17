package com.company.project.service.impl;

import com.company.project.dao.CsysPotStyleMapper;
import com.company.project.model.CsysPotStyle;
import com.company.project.service.CsysPotStyleService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/15.
 */
@Service
@Transactional
public class CsysPotStyleServiceImpl extends AbstractService<CsysPotStyle> implements CsysPotStyleService {
    @Resource
    private CsysPotStyleMapper csysPotStyleMapper;

}
