package com.company.project.service.impl;

import com.company.project.service.CsysNoticeService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysNoticeMapper;
import com.company.project.model.CsysNotice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysNoticeServiceImpl extends AbstractService<CsysNotice> implements CsysNoticeService {
    @Resource
    private CsysNoticeMapper csysNoticeMapper;

}
