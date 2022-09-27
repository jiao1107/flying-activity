package com.flying.activity.service.activity;

import java.util.List;

/**
 * 账户服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:10
 * @since 1.0
 */
public interface ActivityService {

    /**
     * 新增活动
     *
     * @param activity 活动信息
     * @return 新增成功条数
     */
    int create(ActivityBO activity);

    /**
     * 获取活动信息
     *
     * @param id id
     * @return 活动信息
     */
    ActivityBO get(Long id);

    /**
     * 获取活动集合
     *
     * @param query 检索条件
     * @return 活动集合
     */
    List<ActivityBO> list(ActivityBO query);

}
