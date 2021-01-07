package com.cxytiandi.sharding.service.impl;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;
import java.util.List;

import com.cxytiandi.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
		return userRepository.list();
	}

	public Long add(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

	@Override
	public List<OrderDTO> findUserOrder(OrderDTO orderDTO) {
		return userRepository.findUserOrder(orderDTO);
	}


}
