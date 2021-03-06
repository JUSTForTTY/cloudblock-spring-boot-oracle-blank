package com.company.project.service.impl;

import com.company.project.service.CsysNoticeTpService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysNoticeTpMapper;
import com.company.project.model.CsysNoticeTp;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysNoticeTpServiceImpl extends AbstractService<CsysNoticeTp> implements CsysNoticeTpService {
    @Resource
    private CsysNoticeTpMapper csysNoticeTpMapper;

}
