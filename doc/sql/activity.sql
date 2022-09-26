CREATE TABLE `activity`
(
    `id`              bigint(20)                                               NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name`            varchar(64)                                              NOT NULL COMMENT '活动名称',
    `desc`            varchar(256)                                                      DEFAULT NULL COMMENT '活动描述',
    `status`          enum ('on','off')                                        NOT NULL DEFAULT 'on' COMMENT '活动状态',
    `approval_status` enum ('INITIAL','RUNNING','HOLDING','FINISH','REJECTED') NOT NULL DEFAULT 'INITIAL' COMMENT '审批状态',
    `rule_id`         bigint(20)                                               NOT NULL COMMENT '规则id',
    `create_time`     datetime                                                 NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `creator`         varchar(16)                                              NOT NULL COMMENT '创建人',
    `is_deleted`      enum ('no','yes')                                        NOT NULL DEFAULT 'no' COMMENT '是否删除，默认no',
    PRIMARY KEY (`id`),
    KEY `idx_name` (`name`) COMMENT '活动名称索引',
    KEY `idx_desc` (`desc`) COMMENT '活动描述索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin;