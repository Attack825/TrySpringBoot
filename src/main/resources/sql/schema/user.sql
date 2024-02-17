DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`
(
    `id`            bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`          varchar(48) NOT NULL,
    `create_at`     datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    `update_at`     datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    `account`       varchar(255)         DEFAULT NULL,
    `mobile`        varchar(255)         DEFAULT NULL,
    `password_hash` varchar(255)         DEFAULT NULL,
    `nickname`      varchar(255)         DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

# 咕群标准：idx_表名_列名按字典序升序排序
# 阿里标准：业务上具有唯一性的字段，加上唯一索引，主键索引名为pk_字段名；唯一索引名为uk_字段名；普通索引名则为idx_字段名
# 在varchar字段上建立索引时，必须指定索引长度，没必要对全字段建立索引，根据实际文本区分度决定索引长度。
# CREATE UNIQUE INDEX `pk_user_id` ON `user` (`id`);
# CREATE UNIQUE INDEX `idx_user_uuid` ON `user` (`uuid`);
# CREATE UNIQUE INDEX `idx_user_account` ON `user` (`account`(32));
# CREATE UNIQUE INDEX `idx_user_mobile` ON `user` (`mobile`(32));

