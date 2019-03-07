package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu01data0030001Mapper;
import com.company.project.model.CySysBlockSucu01data0030001;
import com.company.project.service.CySysBlockSucu01data0030001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/15.
 */
@Service
@Transactional
public class CySysBlockSucu01data0030001ServiceImpl extends AbstractService<CySysBlockSucu01data0030001> implements CySysBlockSucu01data0030001Service {
    @Resource
    private CySysBlockSucu01data0030001Mapper cySysBlockSucu01data0030001Mapper;

}
