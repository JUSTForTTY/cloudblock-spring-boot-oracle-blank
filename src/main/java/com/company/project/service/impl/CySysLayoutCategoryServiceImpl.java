package com.company.project.service.impl;

import com.company.project.dao.CySysLayoutCategoryMapper;
import com.company.project.model.CySysLayoutCategory;
import com.company.project.service.CySysLayoutCategoryService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/27.
 */
@Service
@Transactional
public class CySysLayoutCategoryServiceImpl extends AbstractService<CySysLayoutCategory> implements CySysLayoutCategoryService {
    @Resource
    private CySysLayoutCategoryMapper cySysLayoutCategoryMapper;

}
