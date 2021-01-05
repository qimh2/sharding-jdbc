package com.cxytiandi.sharding.service.impl;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.OrderRepository;
import com.cxytiandi.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public List<Order> list() {
        return orderRepository.list();
    }

    @Override
    public Long add(Order order) {
        return orderRepository.addOrder(order);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public List<OrderDTO> findUserOrder(OrderDTO orderDTO) {
        return orderRepository.findUserOrder(orderDTO);
    }
}
