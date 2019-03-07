package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu09sinnerbutton0010002Mapper;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010002;
import com.company.project.service.CySysBlockSucu09sinnerbutton0010002Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu09sinnerbutton0010002ServiceImpl extends AbstractService<CySysBlockSucu09sinnerbutton0010002> implements CySysBlockSucu09sinnerbutton0010002Service {
    @Resource
    private CySysBlockSucu09sinnerbutton0010002Mapper cySysBlockSucu09sinnerbutton0010002Mapper;

}
