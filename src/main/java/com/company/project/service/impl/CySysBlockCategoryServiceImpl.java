package com.company.project.service.impl;

import com.company.project.dao.CySysBlockCategoryMapper;
import com.company.project.model.CySysBlockCategory;
import com.company.project.service.CySysBlockCategoryService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2018/08/28.
 */
@Service
@Transactional
public class CySysBlockCategoryServiceImpl extends AbstractService<CySysBlockCategory> implements CySysBlockCategoryService {
    @Resource
    private CySysBlockCategoryMapper cySysBlockCategoryMapper;

}
