CREATE TABLE `activity_rules`
(
    `id`         bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `start_time` datetime DEFAULT NULL COMMENT '开始时间',
    `end_time`   datetime DEFAULT NULL COMMENT '结束时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='规则表';