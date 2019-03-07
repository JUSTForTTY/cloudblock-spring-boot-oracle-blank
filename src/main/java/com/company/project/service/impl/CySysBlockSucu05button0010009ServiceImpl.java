package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0010009Mapper;
import com.company.project.model.CySysBlockSucu05button0010009;
import com.company.project.service.CySysBlockSucu05button0010009Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu05button0010009ServiceImpl extends AbstractService<CySysBlockSucu05button0010009> implements CySysBlockSucu05button0010009Service {
    @Resource
    private CySysBlockSucu05button0010009Mapper cySysBlockSucu05button0010009Mapper;

}
