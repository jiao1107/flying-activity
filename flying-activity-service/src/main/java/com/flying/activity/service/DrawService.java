package com.flying.activity.service;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Service;

/**
 * 抽奖服务
 *
 * @author Feixiang.Jiao
 * @date 2022-09-27 13:58
 * @since 1.0
 */
@Slf4j
@Service
public class DrawService {


    private ThreadLocal<Cache<String, Integer>> fourStarsCounting = new ThreadLocal<>();
    private ThreadLocal<Cache<String, Integer>> fiveStarsCounting = new ThreadLocal<>();

    public String start() {
        // 获取当前用户信息

        // 获取计数保底状态

        // 根据保底状态进行奖品确认

        // 根据本次需要给到的抽奖类型，进行抽奖（其实是需要拿出来抽奖类型，概率）


        return null;
    }

    public String batchStart() {

        return null;
    }

    public String draw() {

        return null;
    }

    private Cache<String, Integer> getFiveStarsCounting() {
        if (fiveStarsCounting.get() != null) {
            return fiveStarsCounting.get();
        }

        // init counting: 1.query data; 2.build cache;


        return null;
    }

    private Cache<String, Integer> getFourStarsCounting() {
        if (fourStarsCounting.get() != null) {
            return fourStarsCounting.get();
        }

        // init counting: 1.query data; 2.build cache;
        return null;
    }

    private void resetFiveStarsCounting() {
        if (fiveStarsCounting.get() != null) {
            fiveStarsCounting.get().put("", 0);
        }
    }

    private void resetFourStarsCounting() {
        if (fourStarsCounting.get() != null) {
            fourStarsCounting.get().put("", 0);
        }
    }

    public static void main(String[] args) {
        String source = "source";
        test(source);
    }

    private static void test(String source) {
        String target = source;
        System.out.println("source: " + source);
        System.out.println("target: " + target);
        target = "target";
        System.out.println("after source: " + source);
        System.out.println("after target: " + target);
    }

}
