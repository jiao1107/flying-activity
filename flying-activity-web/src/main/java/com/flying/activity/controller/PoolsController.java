package com.flying.activity.controller;

import com.flying.activity.dto.LotteryResponse;
import com.flying.activity.service.DrawService;
import com.flying.common.constants.DataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通用的奖池接口类，提供通用的奖池抽取入口
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 12:16
 * @since 1.0
 */
@RestController
@RequestMapping("/pools")
public class PoolsController {

    private Logger logger = LoggerFactory.getLogger(PoolsController.class);

    @Resource
    private DrawService drawService;


    @GetMapping("/draw/{activityId}")
    public DataResult<LotteryResponse> draw(@PathVariable Long activityId) {

        return DataResult.success();
    }


    @GetMapping("/draw/")
    public DataResult<List<LotteryResponse>> draw() {

        return DataResult.success();
    }

}
