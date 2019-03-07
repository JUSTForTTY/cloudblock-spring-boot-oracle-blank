package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu04weight0020004Mapper;
import com.company.project.model.CySysBlockSucu04weight0020004;
import com.company.project.service.CySysBlockSucu04weight0020004Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/03.
 */
@Service
@Transactional
public class CySysBlockSucu04weight0020004ServiceImpl extends AbstractService<CySysBlockSucu04weight0020004> implements CySysBlockSucu04weight0020004Service {
    @Resource
    private CySysBlockSucu04weight0020004Mapper cySysBlockSucu04weight0020004Mapper;

}
