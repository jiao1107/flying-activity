package com.flying.activity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * 启动类
 *
 * @author Feixiang.Jiao
 * @date 2022-08-10 17:10
 * @since 1.0
 */
@EnableRetry
@SpringBootApplication
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        LOGGER.info("----------------------------------->>>> flying activity start success!");
    }

}
