package com.cxytiandi.sharding.repository;

import com.cxytiandi.sharding.dto.OrderDTO;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cxytiandi.sharding.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);

	List<OrderDTO> findUserOrder(OrderDTO orderDTO);
}
