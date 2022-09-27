package com.flying.activity.service.activity;

import com.flying.activity.common.enums.ApprovalStatus;
import com.flying.activity.common.enums.Status;
import com.flying.activity.service.activity.rules.ActivityRuleBO;
import lombok.Data;

import java.util.Date;

/**
 * 活动业务类
 *
 * @author Feixiang.Jiao
 * @date 2022-09-13 16:03
 * @since 1.0
 */
@Data
public class ActivityBO {

    /**
     * 主键id
     */
    private Long id;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动描述
     */
    private String desc;

    /**
     * 状态
     */
    private Status status;

    /**
     * 审批状态
     */
    private ApprovalStatus approvalStatus;

    /**
     * 活动规则信息
     */
    private ActivityRuleBO rule;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private String creator;

    public ActivityBO() {

    }

}
