package com.flying.activity.service.goods.ratio;

import java.util.List;

/**
 * 物品概率服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-27 9:39
 * @since 1.0
 */
public interface GoodsRatioService {

    /**
     * 新增物品概率
     *
     * @param goodsRatio 物品概率情况
     * @return 新增成功条数
     */
    int create(GoodsRatioBO goodsRatio);

    /**
     * 获取物品概率信息
     *
     * @param activityId 活动id
     * @param goodsId    物品id
     * @return 物品概率信息
     */
    GoodsRatioBO get(Long activityId, Long goodsId);

    /**
     * 获取物品概率信息集合
     *
     * @param query 检索条件
     * @return 物品概率信息list
     */
    List<GoodsRatioBO> list(GoodsRatioBO query);

}
