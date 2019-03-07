package com.company.project.service.impl;

import com.company.project.dao.CySysProjectMapper;
import com.company.project.model.CySysProject;
import com.company.project.service.CySysProjectService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Service
@Transactional
public class CySysProjectServiceImpl extends AbstractService<CySysProject> implements CySysProjectService {
    @Resource
    private CySysProjectMapper cySysProjectMapper;

}
