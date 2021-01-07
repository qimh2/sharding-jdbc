package com.cxytiandi.sharding.service.impl;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.dto.TOrderItemDTO;
import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.TOrder;
import com.cxytiandi.sharding.po.TOrderItem;
import com.cxytiandi.sharding.po.User;
import com.cxytiandi.sharding.repository.OrderRepository;
import com.cxytiandi.sharding.repository.TOrderItemRepository;
import com.cxytiandi.sharding.repository.TOrderRepository;
import com.cxytiandi.sharding.repository.UserRepository;
import com.cxytiandi.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TOrderRepository tOrderRepository;

    @Autowired
    private TOrderItemRepository tOrderItemRepository;


    @Override
    public List<Order> list() {
        return orderRepository.list();
    }

    @Override
    public Long add(Order order) {
        return orderRepository.addOrder(order);
    }

    @Override
    public Order findById(Long id,Long userId) {
        return orderRepository.findById(id,userId);
    }

    @Override
    public List<OrderDTO> findUserOrder(OrderDTO orderDTO) {
        return orderRepository.findUserOrder(orderDTO);
    }

    @Override
    public OrderDTO findUserOrderNotLeftJoin(Long userId,String mobile) throws Exception {
        User user = userRepository.findById(userId);
        Order order = orderRepository.findByUserIdAndMobile(user.getId(),mobile);

        if (null == order){
            throw new Exception("订单不存在");
        }

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setUserId(user.getId());
        orderDTO.setCity(user.getCity());
        orderDTO.setName(user.getName());

        return orderDTO;
    }

    @Override
    public List<TOrder> findOrder(TOrderItem tOrderItem) {
        return tOrderRepository.findOrder(tOrderItem);
    }

    @Override
    public Long addOrder(TOrderItemDTO tOrderItemDTO) {
        TOrder tOrder = new TOrder();
        tOrder.setOrderId(tOrderItemDTO.getOrderId());
        Long num = tOrderRepository.addOrder(tOrder);
        Long num2 = tOrderItemRepository.addOrderItem(tOrderItemDTO);

        return num + num2;
    }
}
