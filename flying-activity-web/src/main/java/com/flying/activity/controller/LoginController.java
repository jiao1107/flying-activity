package com.flying.activity.controller;

import com.flying.common.constants.DataResult;
import com.flying.activity.dto.RegisterReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * 登陆登出等相关接口
 *
 * @author Feixiang.Jiao
 * @date 2022-08-22 15:26
 * @since 1.0
 */
@RestController
@RequestMapping("/")
public class LoginController {

    private static Logger logger = LoggerFactory.getLogger(LoginController.class);


    /**
     * 登陆
     *
     * @param loginRequest
     * @return
     */
    @PostMapping(value = "/login", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Object> login(@RequestBody RegisterReq loginRequest) {

        return DataResult.success();
    }



    /**
     * 登出
     * @return
     */
    @PostMapping(value = "/logout", produces = {MediaType.APPLICATION_JSON_VALUE})
    public DataResult<Object> logout() {

        return DataResult.success();
    }

}
