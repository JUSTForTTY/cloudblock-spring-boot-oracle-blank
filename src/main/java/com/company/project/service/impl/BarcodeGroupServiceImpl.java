package com.company.project.service.impl;

import com.company.project.dao.BarcodeGroupMapper;
import com.company.project.model.BarcodeGroup;
import com.company.project.service.BarcodeGroupService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/05/05.
 */
@Service
@Transactional
public class BarcodeGroupServiceImpl extends AbstractService<BarcodeGroup> implements BarcodeGroupService {
    @Resource
    private BarcodeGroupMapper barcodeGroupMapper;

}
