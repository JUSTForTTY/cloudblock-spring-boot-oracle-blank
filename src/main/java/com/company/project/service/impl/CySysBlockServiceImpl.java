package com.company.project.service.impl;

import com.company.project.dao.CySysBlockMapper;
import com.company.project.model.CySysBlock;
import com.company.project.service.CySysBlockService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockServiceImpl extends AbstractService<CySysBlock> implements CySysBlockService {
    @Resource
    private CySysBlockMapper cySysBlockMapper;

}
