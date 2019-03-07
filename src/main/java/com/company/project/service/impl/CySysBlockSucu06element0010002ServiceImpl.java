package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu06element0010002Mapper;
import com.company.project.model.CySysBlockSucu06element0010002;
import com.company.project.service.CySysBlockSucu06element0010002Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/18.
 */
@Service
@Transactional
public class CySysBlockSucu06element0010002ServiceImpl extends AbstractService<CySysBlockSucu06element0010002> implements CySysBlockSucu06element0010002Service {
    @Resource
    private CySysBlockSucu06element0010002Mapper cySysBlockSucu06element0010002Mapper;

}
