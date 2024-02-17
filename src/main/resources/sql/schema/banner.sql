DROP TABLE IF EXISTS `banner`;

CREATE TABLE `banner`
(
    `id`        bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`      varchar(48) NOT NULL,
    `create_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    `update_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    `img_url`   varchar(255) DEFAULT NULL,
    `href_url`  varchar(255) DEFAULT NULL,
    `type`      varchar(255) DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_unicode_ci;

