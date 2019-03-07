package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0010008Mapper;
import com.company.project.model.CySysBlockSucu05button0010008;
import com.company.project.service.CySysBlockSucu05button0010008Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/12.
 */
@Service
@Transactional
public class CySysBlockSucu05button0010008ServiceImpl extends AbstractService<CySysBlockSucu05button0010008> implements CySysBlockSucu05button0010008Service {
    @Resource
    private CySysBlockSucu05button0010008Mapper cySysBlockSucu05button0010008Mapper;

}
