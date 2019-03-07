package com.company.project.service.impl;

import com.company.project.dao.CySysBlockSucu09sinnerbutton0010003Mapper;
import com.company.project.model.CySysBlockSucu09sinnerbutton0010003;
import com.company.project.service.CySysBlockSucu09sinnerbutton0010003Service;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockSucu09sinnerbutton0010003ServiceImpl extends AbstractService<CySysBlockSucu09sinnerbutton0010003> implements CySysBlockSucu09sinnerbutton0010003Service {
    @Resource
    private CySysBlockSucu09sinnerbutton0010003Mapper cySysBlockSucu09sinnerbutton0010003Mapper;

}
