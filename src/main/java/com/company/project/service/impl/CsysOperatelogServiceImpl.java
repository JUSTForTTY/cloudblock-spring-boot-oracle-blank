package com.company.project.service.impl;

import com.company.project.outer.dao.CsysOperatelogMapper;
import com.company.project.outer.model.CsysOperatelog;
import com.company.project.service.CsysOperatelogService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysOperatelogServiceImpl extends AbstractService<CsysOperatelog> implements CsysOperatelogService {
    @Resource
    private CsysOperatelogMapper csysOperatelogMapper;

}
