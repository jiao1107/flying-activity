package com.flying.activity.service.lottery.records.impl;

import com.flying.activity.service.lottery.records.LotteryRecordsBO;
import com.flying.activity.service.lottery.records.LotteryRecordsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户服务实现
 *
 * @author Feixiang.Jiao
 * @date 2022-09-20 14:25
 * @since 1.0
 */
@Service
public class LotteryRecordsServiceImpl implements LotteryRecordsService {

    @Override
    public int createRecord(LotteryRecordsBO lotteryRecord) {
        // todo
        return 0;
    }

    @Override
    public int batchCreate(List<LotteryRecordsBO> lotteryRecords) {
        // todo
        return 0;
    }

    @Override
    public List<LotteryRecordsBO> list(LotteryRecordsBO query) {
        // todo
        return null;
    }

}
