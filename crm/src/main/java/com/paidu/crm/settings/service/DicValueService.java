package com.paidu.crm.settings.service;

import com.paidu.crm.workbench.domain.DicValue;

import java.util.List;

public interface DicValueService {
    List<DicValue> queryDicValueByTypeCode(String appellation);
}
