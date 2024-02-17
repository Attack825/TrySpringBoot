DROP TABLE IF EXISTS `category`;

CREATE TABLE category
(
    `id`        bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`      varchar(48) NOT NULL,
    `create_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    `update_at` datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    `name`      VARCHAR(255)         DEFAULT NULL,
    `img`       VARCHAR(255)         DEFAULT NULL
);