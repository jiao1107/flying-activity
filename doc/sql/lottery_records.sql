CREATE TABLE `lottery_records`
(
    `id`          bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `user_id`     bigint(20) NOT NULL COMMENT '用户id',
    `activity_id` bigint(20) NOT NULL COMMENT '活动id',
    `goods_id`    bigint(20) NOT NULL COMMENT '物品id',
    `create_time` datetime   NOT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`),
    KEY `idx_user_id` (`user_id`) COMMENT '用户id索引',
    KEY `idx_ac_id` (`activity_id`) COMMENT '活动id索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='抽奖记录（结果）表';