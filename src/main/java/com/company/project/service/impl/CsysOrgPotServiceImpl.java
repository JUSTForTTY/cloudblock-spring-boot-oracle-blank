package com.company.project.service.impl;

import com.company.project.service.CsysOrgPotService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysOrgPotMapper;
import com.company.project.model.CsysOrgPot;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysOrgPotServiceImpl extends AbstractService<CsysOrgPot> implements CsysOrgPotService {
    @Resource
    private CsysOrgPotMapper csysOrgPotMapper;

}
