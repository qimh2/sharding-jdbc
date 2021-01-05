package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;

import java.util.List;

public interface OrderService {

	List<Order> list();
	
	Long add(Order order);

    Order findById(Long id,Long userId);

    List<OrderDTO> findUserOrder(OrderDTO orderDTO);

}
