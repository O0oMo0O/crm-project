package com.paidu.crm.workbench.service;

import com.paidu.crm.workbench.domain.TranHistory;

import java.util.List;

public interface TranHistoryService {
    List<TranHistory> queryTranHistoryForDetailByTranId(String id);
}
