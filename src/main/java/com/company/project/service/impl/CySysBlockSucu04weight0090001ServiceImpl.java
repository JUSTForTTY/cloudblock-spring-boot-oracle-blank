package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu04weight0090001Mapper;
import com.company.project.model.CySysBlockSucu04weight0090001;
import com.company.project.service.CySysBlockSucu04weight0090001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/11/16.
 */
@Service
@Transactional
public class CySysBlockSucu04weight0090001ServiceImpl extends AbstractService<CySysBlockSucu04weight0090001> implements CySysBlockSucu04weight0090001Service {
    @Resource
    private CySysBlockSucu04weight0090001Mapper cySysBlockSucu04weight0090001Mapper;

}
