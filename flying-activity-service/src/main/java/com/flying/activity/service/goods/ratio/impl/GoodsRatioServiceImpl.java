package com.flying.activity.service.goods.ratio.impl;

import com.flying.activity.service.goods.ratio.GoodsRatioBO;
import com.flying.activity.service.goods.ratio.GoodsRatioService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 物品概率服务实现类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-27 9:43
 * @since 1.0
 */
@Service
public class GoodsRatioServiceImpl implements GoodsRatioService {
    @Override
    public int create(GoodsRatioBO goodsRatio) {
        return 0;
    }

    @Override
    public GoodsRatioBO get(Long activityId, Long goodsId) {
        return null;
    }

    @Override
    public List<GoodsRatioBO> list(GoodsRatioBO query) {
        return null;
    }
}
