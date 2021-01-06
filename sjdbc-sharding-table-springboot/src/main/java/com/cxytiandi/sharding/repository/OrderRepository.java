package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface OrderRepository {
	
	Long addOrder(Order order);
	
	List<Order> list();

	Order findById(@Param("id") Long id, @Param("userId") Long userId);
	Order findByUserIdAndMobile( @Param("userId") Long userId,@Param("mobile") String mobile);

	List<OrderDTO> findUserOrder(OrderDTO orderDTO);

}
