package com.company.project.service.impl;

import com.company.project.dao.CsysPageGroupMapper;
import com.company.project.model.CsysPageGroup;
import com.company.project.service.CsysPageGroupService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/07/04.
 */
@Service
@Transactional
public class CsysPageGroupServiceImpl extends AbstractService<CsysPageGroup> implements CsysPageGroupService {
    @Resource
    private CsysPageGroupMapper csysPageGroupMapper;

}
