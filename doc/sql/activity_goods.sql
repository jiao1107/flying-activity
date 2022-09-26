CREATE TABLE `activity_goods`
(
    `id`          bigint(20)                                                             NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `code`        varchar(32)                                                            NOT NULL COMMENT '物品编码',
    `name`        varchar(64)                                                            NOT NULL COMMENT '物品名称',
    `type`        enum ('entity','virtual')                                              NOT NULL DEFAULT 'virtual' COMMENT '物品类型：实物/虚拟',
    `rarity`      enum ('five_stars','four_stars','three_stars','two_stars','one_stars') NOT NULL COMMENT '稀有度',
    `status`      enum ('on','off')                                                      NOT NULL DEFAULT 'on' COMMENT '状态：上架/下架',
    `desc`        varchar(256)                                                                    DEFAULT NULL COMMENT '物品描述',
    `create_time` datetime                                                               NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `is_deleted`  enum ('no','yes')                                                      NOT NULL DEFAULT 'no' COMMENT '是否删除，默认no',
    PRIMARY KEY (`id`),
    KEY `idx_code` (`code`) COMMENT '编码索引',
    KEY `idx_name` (`name`) COMMENT '名称索引'
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='物品表';