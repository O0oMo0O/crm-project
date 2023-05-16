package com.paidu.crm.workbench.service;

import com.paidu.crm.workbench.domain.Activity;

import java.util.List;
import java.util.Map;

public interface ActivityService {
    public int saveCreateActivity(Activity activity);

    List<Activity> queryActivityByConditionForPage(Map<String, Object> map);

    int queryCountOfActivityByCondition(Map<String, Object> map);

    int deleteActivityByIds(String[] id);

    Activity queryActivityById(String id);

    int updateActivity(Activity activity);
    List<Activity> queryAllActivitys();

    int saveCreateActivityByList(List<Activity> activityList);
    Activity queryActivityForDetailById(String id);

    List<Activity> queryActivityForDetailByClueId(String clueId);

    List<Activity> queryActivityForDetailByNameClueId(Map<String,Object> map);

    List<Activity> queryActivityForDetailByIds(String[] ids);

    List<Activity> queryActivityForConvertByNameClueId(Map<String,Object> map);

}
