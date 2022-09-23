CREATE TABLE `accounts`
(
    `id`      bigint(20)                NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `account` varchar(64)               NOT NULL COMMENT '账号，目前主要使用手机号即可',
    `type`    enum ('main','assistant') NOT NULL DEFAULT 'main' COMMENT '枚举，主账号/副账号',
    `pwd_id`  bigint(20)                NOT NULL COMMENT '密码id，绑定实际密码',
    `user_id` bigint(20)                NOT NULL COMMENT '用户id，绑定用户信息',
    PRIMARY KEY (`id`),
    KEY `idx_account` (`account`) COMMENT '账号索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='账号表';