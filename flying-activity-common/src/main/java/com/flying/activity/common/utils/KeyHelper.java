package com.flying.activity.common.utils;

import com.flying.activity.common.constants.UsersConstants;
import org.springframework.util.Assert;

/**
 * 构建key的辅助类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-20 9:31
 * @since 1.0
 */
public class KeyHelper {
    private KeyHelper() {
    }

    private static final String COLON = ":";


    public static String assembleKey(String businessType, String key) {
        return assembleKey(UsersConstants.APP_NAME, businessType, key);
    }

    /**
     * 组装key
     *
     * @param appName      应用名
     * @param businessType 业务类型
     * @param keys         key集合
     * @return 完整的key值，eg：flying-activity:verify:register:13273740524，
     * 指的就是用户模块，验证码，注册逻辑中的13273740524用户的key
     */
    private static String assembleKey(String appName, String businessType, String... keys) {
        Assert.notNull(appName, "appName can not be null");
        Assert.notNull(businessType, "businessType can not be null");

        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append(appName).append(COLON);
        sBuilder.append(businessType).append(COLON);

        int length = keys.length;
        for (int i = 1; i <= length; i++) {
            String key = keys[i - 1];
            sBuilder.append(key).append(COLON);
            // 最后一个元素，只拼接值，不拼接冒号
            if (i == length) {
                sBuilder.append(key);
            }
        }
        return sBuilder.toString();
    }

}
