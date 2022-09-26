package com.flying.activity.common.enums;

import lombok.Getter;

/**
 * 审批状态
 *
 * @author Feixiang.Jiao
 * @date 2022-09-01 11:24
 * @since 1.0
 */
@Getter
public enum  ApprovalStatus {

    INITIAL(),
    RUNNING(),
    HOLDING(),
    FINISH(),
    REJECTED();

}
