DROP TABLE IF EXISTS `address`;

CREATE TABLE `address`
(
    `id`            bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`          varchar(48) NOT NULL,
    `create_at`     datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    `update_at`     datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    `user_id`       bigint(20)  NOT NULL,
    `receiver`      varchar(255)         DEFAULT NULL,
    `contact`       varchar(255)         DEFAULT NULL,
    `province_code` varchar(255)         DEFAULT NULL,
    `city_code`     varchar(255)         DEFAULT NULL,
    `county_code`   varchar(255)         DEFAULT NULL,
    `address`       varchar(255)         DEFAULT NULL,
    `postal_code`   varchar(255)         DEFAULT NULL,
    `address_tags`  varchar(255)         DEFAULT NULL,
    # is_xxx默认数据类型为tinyint
    `is_default`    tinyint              DEFAULT NULL,
    `full_location` varchar(255)         DEFAULT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
