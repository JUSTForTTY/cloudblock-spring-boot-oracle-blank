package com.company.project.service.impl;

import com.company.project.dao.CySysLayoutMapper;
import com.company.project.model.CySysLayout;
import com.company.project.service.CySysLayoutService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Service
@Transactional
public class CySysLayoutServiceImpl extends AbstractService<CySysLayout> implements CySysLayoutService {
    @Resource
    private CySysLayoutMapper cySysLayoutMapper;

}
