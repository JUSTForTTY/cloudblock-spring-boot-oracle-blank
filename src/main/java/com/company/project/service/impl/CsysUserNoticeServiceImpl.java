package com.company.project.service.impl;

import com.company.project.service.CsysUserNoticeService;
import com.company.project.core.service.AbstractService;
import com.company.project.dao.CsysUserNoticeMapper;
import com.company.project.model.CsysUserNotice;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysUserNoticeServiceImpl extends AbstractService<CsysUserNotice> implements CsysUserNoticeService {
    @Resource
    private CsysUserNoticeMapper csysUserNoticeMapper;

}
