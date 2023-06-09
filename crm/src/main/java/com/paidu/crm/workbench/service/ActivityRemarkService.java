package com.paidu.crm.workbench.service;

import com.paidu.crm.workbench.domain.ActivityRemark;

import java.util.List;

public interface ActivityRemarkService {
     List<ActivityRemark> queryActivityRemarkForDetailByActivityId(String activityId);

    int saveCreateActivityRemark(ActivityRemark remark);

    int deleteActivityRemarkById(String id);

    int saveEditActivityRemark(ActivityRemark remark);
}
