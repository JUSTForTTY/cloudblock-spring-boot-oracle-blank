package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu04weight0030007Mapper;
import com.company.project.model.CySysBlockSucu04weight0030007;
import com.company.project.service.CySysBlockSucu04weight0030007Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/03.
 */
@Service
@Transactional
public class CySysBlockSucu04weight0030007ServiceImpl extends AbstractService<CySysBlockSucu04weight0030007> implements CySysBlockSucu04weight0030007Service {
    @Resource
    private CySysBlockSucu04weight0030007Mapper cySysBlockSucu04weight0030007Mapper;

}
