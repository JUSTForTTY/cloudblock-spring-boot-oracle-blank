package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0020001Mapper;
import com.company.project.model.CySysBlockSucu05button0020001;
import com.company.project.service.CySysBlockSucu05button0020001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/13.
 */
@Service
@Transactional
public class CySysBlockSucu05button0020001ServiceImpl extends AbstractService<CySysBlockSucu05button0020001> implements CySysBlockSucu05button0020001Service {
    @Resource
    private CySysBlockSucu05button0020001Mapper cySysBlockSucu05button0020001Mapper;

}
