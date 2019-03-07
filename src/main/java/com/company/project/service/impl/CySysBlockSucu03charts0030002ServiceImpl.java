package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu03charts0030002Mapper;
import com.company.project.model.CySysBlockSucu03charts0030002;
import com.company.project.service.CySysBlockSucu03charts0030002Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/03.
 */
@Service
@Transactional
public class CySysBlockSucu03charts0030002ServiceImpl extends AbstractService<CySysBlockSucu03charts0030002> implements CySysBlockSucu03charts0030002Service {
    @Resource
    private CySysBlockSucu03charts0030002Mapper cySysBlockSucu03charts0030002Mapper;

}
