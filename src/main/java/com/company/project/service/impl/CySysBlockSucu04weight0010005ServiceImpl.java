package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu04weight0010005Mapper;
import com.company.project.model.CySysBlockSucu04weight0010005;
import com.company.project.service.CySysBlockSucu04weight0010005Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/09/03.
 */
@Service
@Transactional
public class CySysBlockSucu04weight0010005ServiceImpl extends AbstractService<CySysBlockSucu04weight0010005> implements CySysBlockSucu04weight0010005Service {
    @Resource
    private CySysBlockSucu04weight0010005Mapper cySysBlockSucu04weight0010005Mapper;

}
