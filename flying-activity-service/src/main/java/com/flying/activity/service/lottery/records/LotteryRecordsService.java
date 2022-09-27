package com.flying.activity.service.lottery.records;

import java.util.List;

/**
 * 抽奖服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 14:14
 * @since 1.0
 */

public interface LotteryRecordsService {

    /**
     * 单次保存抽奖记录
     *
     * @param lotteryRecord 抽奖记录
     * @return 保存成功条数
     */
    int createRecord(LotteryRecordsBO lotteryRecord);

    /**
     * 批量保存抽奖记录
     *
     * @param lotteryRecords 抽奖记录集合
     * @return 保存成功条数
     */
    int batchCreate(List<LotteryRecordsBO> lotteryRecords);

    /**
     * 获取抽奖记录
     *
     * @param query 查询条件
     * @return 抽奖记录list
     */
    List<LotteryRecordsBO> list(LotteryRecordsBO query);

    // 这里需要预留一个分页查询的


}
