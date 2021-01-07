CREATE TABLE `t_order_item_0`(
	order_item_id bigint(64) not null,
    order_id bigint(64) not null,
	brand_code TINYINT (1) DEFAULT 0,
	PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `t_order_item_1`(
	order_item_id bigint(64) not null,
	order_id bigint(64) not null,
	brand_code TINYINT (1) DEFAULT 0,
	PRIMARY KEY (`order_item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;