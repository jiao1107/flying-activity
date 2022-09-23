package com.flying.activity.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 基础测试用例启动类
 *
 * @author Feixiang.Jiao
 * @date 2022-08-10 17:15
 * @since 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration
public class BaseTestApplication {

    private Logger logger = LoggerFactory.getLogger(BaseTestApplication.class);


    @Test
    public void hello() {
        logger.info("----------------> hello this is a tester!");
    }

}
