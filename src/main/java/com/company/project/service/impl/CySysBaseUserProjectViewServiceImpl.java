package com.company.project.service.impl;

import com.company.project.dao.CySysBaseUserProjectViewMapper;
import com.company.project.model.CySysBaseUserProjectView;
import com.company.project.service.CySysBaseUserProjectViewService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Service
@Transactional
public class CySysBaseUserProjectViewServiceImpl extends AbstractService<CySysBaseUserProjectView> implements CySysBaseUserProjectViewService {
    @Resource
    private CySysBaseUserProjectViewMapper cySysBaseUserProjectViewMapper;

}
