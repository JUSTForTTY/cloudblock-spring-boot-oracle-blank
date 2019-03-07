package com.company.project.service.impl;

import com.company.project.dao.CySysProjectPublishMapper;
import com.company.project.model.CySysProjectPublish;
import com.company.project.service.CySysProjectPublishService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/11/20.
 */
@Service
@Transactional
public class CySysProjectPublishServiceImpl extends AbstractService<CySysProjectPublish> implements CySysProjectPublishService {
    @Resource
    private CySysProjectPublishMapper cySysProjectPublishMapper;

}
