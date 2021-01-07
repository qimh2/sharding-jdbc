package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.TOrder;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface TOrderRepository {

	List<TOrder> findOrder(TOrder tOrder);

}
