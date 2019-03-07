package com.company.project.service.impl;

import com.company.project.dao.CySysBaseUserProjectMapper;
import com.company.project.model.CySysBaseUserProject;
import com.company.project.service.CySysBaseUserProjectService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Service
@Transactional
public class CySysBaseUserProjectServiceImpl extends AbstractService<CySysBaseUserProject> implements CySysBaseUserProjectService {
    @Resource
    private CySysBaseUserProjectMapper cySysBaseUserProjectMapper;

}
