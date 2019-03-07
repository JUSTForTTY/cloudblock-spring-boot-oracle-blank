package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu01data0010001Mapper;
import com.company.project.model.CySysBlockSucu01data0010001;
import com.company.project.service.CySysBlockSucu01data0010001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu01data0010001ServiceImpl extends AbstractService<CySysBlockSucu01data0010001> implements CySysBlockSucu01data0010001Service {
    @Resource
    private CySysBlockSucu01data0010001Mapper cySysBlockSucu01data0010001Mapper;

}
