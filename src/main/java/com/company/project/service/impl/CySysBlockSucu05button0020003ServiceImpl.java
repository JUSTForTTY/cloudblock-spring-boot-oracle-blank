package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu05button0020003Mapper;
import com.company.project.model.CySysBlockSucu05button0020003;
import com.company.project.service.CySysBlockSucu05button0020003Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu05button0020003ServiceImpl extends AbstractService<CySysBlockSucu05button0020003> implements CySysBlockSucu05button0020003Service {
    @Resource
    private CySysBlockSucu05button0020003Mapper cySysBlockSucu05button0020003Mapper;

}
