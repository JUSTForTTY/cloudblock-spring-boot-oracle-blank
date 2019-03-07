package com.company.project.service.impl;

import com.company.project.outer.dao.CsysFieldInfoMapper;
import com.company.project.outer.model.CsysFieldInfo;
import com.company.project.service.CsysFieldInfoService;
import com.company.project.core.service.AbstractService;
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
