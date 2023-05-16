package com.paidu.crm.workbench.service.impl;

import com.paidu.crm.workbench.domain.ClueActivityRelation;
import com.paidu.crm.workbench.mapper.ClueActivityRelationMapper;
import com.paidu.crm.workbench.service.ClueActivityRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("clueActivityRelationServiceImpl")
public class ClueActivityRelationServiceImpl implements ClueActivityRelationService {
    @Autowired
    private ClueActivityRelationMapper clueActivityRelationMapper;

    @Override
    public int saveCreateClueActivityRelationByList(List<ClueActivityRelation> relationList) {
        return clueActivityRelationMapper.insertClueActivityRelationByList(relationList);
    }

    @Override
    public int deleteClueActivityRelationByClueIdActivityId(ClueActivityRelation relation) {
        return clueActivityRelationMapper.deleteClueActivityRelationByClueIdActivityId(relation);
    }
}
