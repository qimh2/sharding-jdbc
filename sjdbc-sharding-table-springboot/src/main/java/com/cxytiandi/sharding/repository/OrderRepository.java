package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface OrderRepository {
	
	Long addOrder(Order order);
	
	List<Order> list();

	Order findById(Long id);

	List<OrderDTO> findUserOrder(OrderDTO orderDTO);

}
