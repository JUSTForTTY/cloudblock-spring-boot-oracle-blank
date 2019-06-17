package com.company.project.service.impl;

import com.company.project.dao.CsysPotGroupMapper;
import com.company.project.model.CsysPotGroup;
import com.company.project.service.CsysPotGroupService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/06/14.
 */
@Service
@Transactional
public class CsysPotGroupServiceImpl extends AbstractService<CsysPotGroup> implements CsysPotGroupService {
    @Resource
    private CsysPotGroupMapper csysPotGroupMapper;

}
