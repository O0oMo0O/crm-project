package com.paidu.crm.workbench.service.impl;

import com.paidu.crm.workbench.domain.Clue;
import com.paidu.crm.workbench.domain.ClueRemark;
import com.paidu.crm.workbench.mapper.ClueRemarkMapper;
import com.paidu.crm.workbench.service.ClueRemarkService;
import com.paidu.crm.workbench.service.ClueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service("clueRemarkService")
public class ClueRemarkServiceImpl implements ClueRemarkService {
    @Autowired
    private ClueRemarkMapper clueRemarkMapper;

    @Override
    public List<ClueRemark> queryClueRemarkForDetailByClueId(String clueId) {
        return clueRemarkMapper.selectClueRemarkForDetailByClueId(clueId);
    }
}
