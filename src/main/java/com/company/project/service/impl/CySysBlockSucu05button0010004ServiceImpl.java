package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0010004Mapper;
import com.company.project.model.CySysBlockSucu05button0010004;
import com.company.project.service.CySysBlockSucu05button0010004Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu05button0010004ServiceImpl extends AbstractService<CySysBlockSucu05button0010004> implements CySysBlockSucu05button0010004Service {
    @Resource
    private CySysBlockSucu05button0010004Mapper cySysBlockSucu05button0010004Mapper;

}
