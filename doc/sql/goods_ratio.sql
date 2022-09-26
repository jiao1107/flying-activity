CREATE TABLE `goods_ratio`
(
    `id`          bigint(20)    NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `activity_id` bigint(20)    NOT NULL COMMENT '活动id',
    `goods_id`    bigint(20)    NOT NULL COMMENT '物品id',
    `probability` decimal(8, 4) NOT NULL COMMENT '概率',
    `is_default`  tinyint(1)    NOT NULL DEFAULT '0' COMMENT '是否默认物品',
    `guaranteed`  int(255)      NOT NULL DEFAULT '0' COMMENT '保底',
    PRIMARY KEY (`id`),
    KEY `idx_ac_id` (`activity_id`) COMMENT '活动id',
    KEY `idx_gd_id` (`goods_id`) COMMENT '物品id'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='概率表';