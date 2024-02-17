DROP TABLE IF EXISTS `public`;

CREATE TABLE `public`
(
    `id`        bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`      varchar(48) NOT NULL,
    `create_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    # update_at可选
    `update_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    # delete_at可选
    `delete_at` datetime(6)          DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;
# JVM 里均使用 LocalDateTime，在 MySQL 中均使用 DateTime。DBMS中采用蛇形命名法，JVM中采用驼峰命名法。
