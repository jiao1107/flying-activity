CREATE TABLE `pwd_historic_records`
(
    `id`          bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `account_id`  bigint(20)  NOT NULL COMMENT '账号主键id',
    `password`    varchar(64) NOT NULL COMMENT '密码',
    `slat`        varchar(8)  NOT NULL COMMENT '盐',
    `create_time` datetime    NOT NULL                  DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `version`     int(11)     NOT NULL COMMENT '版本号，依次递增，用来记录密码修改的顺序',
    `is_deleted`  enum ('yes','no') COLLATE utf8mb4_bin DEFAULT 'no' COMMENT '是否删除，默认no',
    PRIMARY KEY (`id`),
    KEY `idx_account_id` (`account_id`) COMMENT '账号id索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='密码记录表';