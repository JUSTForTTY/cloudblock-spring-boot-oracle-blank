package com.company.project.service.impl;

import com.company.project.outer.dao.CsysPotTrsConMapper;
import com.company.project.outer.model.CsysPotTrsCon;
import com.company.project.service.CsysPotTrsConService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Service
@Transactional
public class CsysPotTrsConServiceImpl extends AbstractService<CsysPotTrsCon> implements CsysPotTrsConService {
    @Resource
    private CsysPotTrsConMapper csysPotTrsConMapper;

}
