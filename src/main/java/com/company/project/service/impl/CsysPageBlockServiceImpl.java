package com.company.project.service.impl;

import com.company.project.outer.dao.CsysPageBlockMapper;
import com.company.project.outer.model.CsysPageBlock;
import com.company.project.service.CsysPageBlockService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysPageBlockServiceImpl extends AbstractService<CsysPageBlock> implements CsysPageBlockService {
    @Resource
    private CsysPageBlockMapper csysPageBlockMapper;

}
