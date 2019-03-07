package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu08searchweiget0040001Mapper;
import com.company.project.model.CySysBlockSucu08searchweiget0040001;
import com.company.project.service.CySysBlockSucu08searchweiget0040001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu08searchweiget0040001ServiceImpl extends AbstractService<CySysBlockSucu08searchweiget0040001> implements CySysBlockSucu08searchweiget0040001Service {
    @Resource
    private CySysBlockSucu08searchweiget0040001Mapper cySysBlockSucu08searchweiget0040001Mapper;

}
