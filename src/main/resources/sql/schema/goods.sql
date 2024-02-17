DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods`
(
    `id`                    bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`                  varchar(48) NOT NULL,
    `create_at`             datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    `update_at`             datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    `delete_at`             datetime(6)          DEFAULT NULL,
    `name`                  varchar(255)         DEFAULT NULL,
    `old_price`             decimal(10, 2)       DEFAULT NULL, # 原价
    `new_price`             decimal(10, 2)       DEFAULT NULL, # 现价
    `discount`              decimal(10, 2)       DEFAULT NULL, # 折扣
    `stock`                 int(11)              DEFAULT NULL, # 库存
    `sales`                 int(11)              DEFAULT NULL, # 销量
    `title`                 varchar(255)         DEFAULT NULL,
    `content`               varchar(255)         DEFAULT NULL,
    `img_list`              TEXT                 DEFAULT NULL,
    `certificate_possessor` varchar(255)         DEFAULT NULL,
    `category_id`           varchar(255)         DEFAULT NULL,
    `certificate_id`        varchar(255)         DEFAULT NULL,
    `address`               varchar(255)         DEFAULT NULL,
    `is_effective`          int(11)              DEFAULT NULL  # 0:无效 1:有效

) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;