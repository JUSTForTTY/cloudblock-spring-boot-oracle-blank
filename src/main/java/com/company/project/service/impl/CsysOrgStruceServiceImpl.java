package com.company.project.service.impl;

import com.company.project.outer.dao.CsysOrgStruceMapper;
import com.company.project.outer.model.CsysOrgStruce;
import com.company.project.service.CsysOrgStruceService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysOrgStruceServiceImpl extends AbstractService<CsysOrgStruce> implements CsysOrgStruceService {
    @Resource
    private CsysOrgStruceMapper csysOrgStruceMapper;

}
