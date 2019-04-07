package com.company.project.service.impl;

import com.company.project.service.CsysFieldInfoService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysFieldInfoMapper;
import com.company.project.model.CsysFieldInfo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysFieldInfoServiceImpl extends AbstractService<CsysFieldInfo> implements CsysFieldInfoService {
    @Resource
    private CsysFieldInfoMapper csysFieldInfoMapper;

}
