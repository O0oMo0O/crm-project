package com.paidu.crm.workbench.service;

import com.paidu.crm.workbench.domain.Clue;
import com.paidu.crm.workbench.domain.ClueRemark;

import java.util.List;
import java.util.Map;

public interface ClueRemarkService {
    List<ClueRemark> queryClueRemarkForDetailByClueId(String clueId);
}
