package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0020002Mapper;
import com.company.project.model.CySysBlockSucu05button0020002;
import com.company.project.service.CySysBlockSucu05button0020002Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/13.
 */
@Service
@Transactional
public class CySysBlockSucu05button0020002ServiceImpl extends AbstractService<CySysBlockSucu05button0020002> implements CySysBlockSucu05button0020002Service {
    @Resource
    private CySysBlockSucu05button0020002Mapper cySysBlockSucu05button0020002Mapper;

}
