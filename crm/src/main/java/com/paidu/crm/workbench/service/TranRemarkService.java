package com.paidu.crm.workbench.service;

import com.paidu.crm.workbench.domain.TranRemark;

import java.util.List;

public interface TranRemarkService {
    List<TranRemark> queryTranRemarkForDetailByTranId(String id);
}
