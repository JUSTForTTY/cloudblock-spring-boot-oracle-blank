package com.company.project.service.impl;

import com.company.project.outer.dao.CsysSequenceMapper;
import com.company.project.outer.model.CsysSequence;
import com.company.project.service.CsysSequenceService;
import com.company.project.core.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by tty on 2019/01/23.
 */
@Service
@Transactional
public class CsysSequenceServiceImpl extends AbstractService<CsysSequence> implements CsysSequenceService {
    @Resource
    private CsysSequenceMapper csysSequenceMapper;

}
