package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu07innerweiget0020001Mapper;
import com.company.project.model.CySysBlockSucu07innerweiget0020001;
import com.company.project.service.CySysBlockSucu07innerweiget0020001Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu07innerweiget0020001ServiceImpl extends AbstractService<CySysBlockSucu07innerweiget0020001> implements CySysBlockSucu07innerweiget0020001Service {
    @Resource
    private CySysBlockSucu07innerweiget0020001Mapper cySysBlockSucu07innerweiget0020001Mapper;

}
