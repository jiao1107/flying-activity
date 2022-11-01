package com.flying.activity.controller;

import com.flying.activity.common.enums.EventType;
import com.flying.activity.service.activity.ActivityBO;
import com.flying.activity.service.activity.IActivityService;
import com.flying.activity.service.events.EventBO;
import com.flying.activity.service.events.IEventsService;
import com.flying.common.constants.DataResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 相关事件api
 *
 * @author Feixiang.Jiao
 * @date 2022-11-01 9:45
 * @since 1.0
 */
@RestController
@RequestMapping("/event")
public class EventsController {

    @Resource
    private IEventsService eventsService;
    @Resource
    private IActivityService activityService;

    /**
     * 分享
     * 1、获取活动信息，校验活动信息
     * 2、生成分享事件数据，并根据活动配置的url，进行拼接
     * 3、返回url（可以进行短链封装，返回相关短链。因为长链接在很多页面无法打开和使用；
     * 4、返回前更新url到事件表扩展属性中
     */
    @PostMapping("/share/{actNo}")
    public DataResult<String> share(@PathVariable String actNo) {
        ActivityBO activity = activityService.getAndCheck(Long.parseLong(actNo));
        eventsService.create(new EventBO().setActId(activity.getId()), EventType.share);
        return DataResult.success();
    }

    /**
     * 被邀请
     * 1、根据分享的链接（长链，实际请求会处理成原链接）中携带的share_id，拿到原始的分享数据；
     * 2、查询一次活动信息，并进行校验
     * 3、进行原始分享数据的查询
     * 4、进行新数据的新增（先查后新增，确保数据唯一，这里要使用到分布式锁，来放置多条数据的出现）
     */
    @GetMapping("/invited/{id}")
    public DataResult<Void> invited(@PathVariable Long id) {

        return DataResult.success();
    }

    /**
     * 助力
     * 1、根据分享的链接（长链，实际请求会处理成原链接）中携带的share_id，拿到原始的分享数据；
     * 2、查询一次活动信息，并进行校验
     * 3、进行原始分享数据的查询
     * 4、进行新数据的新增（先查后新增，确保数据唯一，这里要使用到分布式锁，来放置多条数据的出现）
     */
    @GetMapping("/help/{id}")
    public DataResult<Void> help(@PathVariable Long id) {

        return DataResult.success();
    }

    /**
     * 每日登陆
     */
    @PostMapping("/daily/login/{actNo}")
    public DataResult<Long> dailyLogin(@PathVariable String actNo) {

        return DataResult.success();
    }

}
