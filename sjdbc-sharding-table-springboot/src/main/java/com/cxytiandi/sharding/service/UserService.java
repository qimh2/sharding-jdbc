package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.dto.OrderDTO;
import java.util.List;

import com.cxytiandi.sharding.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);

	List<OrderDTO> findUserOrder(OrderDTO orderDTO);
	
}
