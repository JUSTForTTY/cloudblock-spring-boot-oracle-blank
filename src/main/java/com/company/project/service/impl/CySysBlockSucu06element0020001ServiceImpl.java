package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu06element0020001Mapper;
import com.company.project.model.CySysBlockSucu06element0020001;
import com.company.project.service.CySysBlockSucu06element0020001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/11/09.
 */
@Service
@Transactional
public class CySysBlockSucu06element0020001ServiceImpl extends AbstractService<CySysBlockSucu06element0020001> implements CySysBlockSucu06element0020001Service {
    @Resource
    private CySysBlockSucu06element0020001Mapper cySysBlockSucu06element0020001Mapper;

}
