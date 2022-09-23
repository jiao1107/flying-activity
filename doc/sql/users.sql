CREATE TABLE `users`
(
    `id`          bigint(20)        NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `name`        varchar(128)               DEFAULT NULL COMMENT '姓名',
    `nick_name`   varchar(128)               DEFAULT NULL COMMENT '昵称',
    `avatar`      varchar(255)               DEFAULT NULL COMMENT '头像',
    `create_time` datetime          NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `version`     int(11)           NOT NULL COMMENT '版本号，依次递增，用来记录信息修改的历史',
    `is_deleted`  enum ('yes','no') NOT NULL DEFAULT 'no' COMMENT '是否删除，默认no',
    PRIMARY KEY (`id`),
    KEY `idx_name` (`name`) COMMENT '姓名索引',
    KEY `idx_nick_name` (`nick_name`) COMMENT '昵称索引',
    KEY `idx_create_time` (`create_time`) COMMENT '创建时间'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='用户信息表';