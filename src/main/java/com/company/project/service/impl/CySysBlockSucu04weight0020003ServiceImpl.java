package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu04weight0020003Mapper;
import com.company.project.model.CySysBlockSucu04weight0020003;
import com.company.project.service.CySysBlockSucu04weight0020003Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/03.
 */
@Service
@Transactional
public class CySysBlockSucu04weight0020003ServiceImpl extends AbstractService<CySysBlockSucu04weight0020003> implements CySysBlockSucu04weight0020003Service {
    @Resource
    private CySysBlockSucu04weight0020003Mapper cySysBlockSucu04weight0020003Mapper;

}
