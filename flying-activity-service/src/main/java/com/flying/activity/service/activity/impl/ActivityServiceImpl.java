package com.flying.activity.service.activity.impl;

import com.flying.activity.service.activity.ActivityBO;
import com.flying.activity.service.activity.ActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账号服务实现类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:28
 * @since 1.0
 */
@Service
public class ActivityServiceImpl implements ActivityService {


    @Override
    public int create(ActivityBO activity) {
        return 0;
    }

    @Override
    public ActivityBO get(Long id) {
        return null;
    }

    @Override
    public List<ActivityBO> list(ActivityBO query) {
        return null;
    }
}
