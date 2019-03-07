package com.company.project.service.impl;

import com.company.project.outer.dao.CsysTrsAuthViewMapper;
import com.company.project.outer.model.CsysTrsAuthView;
import com.company.project.service.CsysTrsAuthViewService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/02/26.
 */
@Service
@Transactional
public class CsysTrsAuthViewServiceImpl extends AbstractService<CsysTrsAuthView> implements CsysTrsAuthViewService {
    @Resource
    private CsysTrsAuthViewMapper csysTrsAuthViewMapper;

}
