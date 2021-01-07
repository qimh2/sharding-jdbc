package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.po.TOrder;
import com.cxytiandi.sharding.po.TOrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TOrderRepository {

	long addOrder(TOrder tOrder);

	List<TOrder> findOrder(TOrderItem tOrderItem);

}
