DROP TABLE IF EXISTS `oms_order`;

CREATE TABLE `oms_order`
(
    `id`              bigint(20)  NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `uuid`            varchar(48) NOT NULL,
    `create_at`       datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6),
    # update_at可选
    `update_at`       datetime(6) NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6),
    # delete_at可选
    `delete_at`       datetime(6)          DEFAULT NULL,
    `pay_type`        int(11)              DEFAULT NULL, #支付类型 1为在线支付，2为货到付款
    `order_state`     int(11)              DEFAULT NULL, #1为待付款、2为待发货、3为待收货、4为待评价、5为已完成、6为已取消
    `pay_latest_time` datetime(6)          DEFAULT NULL, #最晚支付时间
    `post_fee`        decimal(10, 2)       DEFAULT NULL, #邮费
    `pay_money`       decimal(10, 2)       DEFAULT NULL, #实付金额
    `total_money`     decimal(10, 2)       DEFAULT NULL, #总金额
    `total_num`       int(11)              DEFAULT NULL, #商品总数量
    `skus`            varchar(255)         DEFAULT NULL, #商品sku
    `pay_channel`     int(11)              DEFAULT NULL, #支付渠道 1为微信支付，2为支付宝支付
    `countdown`       int(11)              DEFAULT NULL, #倒计时
    `user_id`         bigint(20)           DEFAULT NULL, #用户id
    `address_id`      bigint(20)           DEFAULT NULL, #收货地址id
    `pay_time`        datetime(6)          DEFAULT NULL, #支付时间
    `post_time`       datetime(6)          DEFAULT NULL, #发货时间
    `receive_time`    datetime(6)          DEFAULT NULL, #收货时间
    `comment_time`    datetime(6)          DEFAULT NULL, #评价时间
    `cancel_time`     datetime(6)          DEFAULT NULL  #取消时间
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;