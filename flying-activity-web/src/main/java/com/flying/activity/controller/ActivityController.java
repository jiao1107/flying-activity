package com.flying.activity.controller;

import com.flying.common.constants.DataResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 活动api
 *
 * @author Feixiang.Jiao
 * @date 2022-09-27 12:12
 * @since 1.0
 */
@RestController
@RequestMapping("/activity")
public class ActivityController {

    public DataResult<Long> create() {

        return DataResult.success();
    }

}
