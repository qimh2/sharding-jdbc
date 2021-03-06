package com.cxytiandi.sharding.service;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.dto.TOrderItemDTO;
import com.cxytiandi.sharding.po.Order;

import com.cxytiandi.sharding.po.TOrder;
import com.cxytiandi.sharding.po.TOrderItem;

import java.util.List;

public interface OrderService {


    List<Order> list();

    Long add(Order order);

    Order findById(Long id, Long userId);

    List<OrderDTO> findUserOrder(OrderDTO orderDTO);

    OrderDTO findUserOrderNotLeftJoin(Long userId, String mobile) throws Exception;

    List<TOrder> findOrder(TOrderItem tOrderItem);

    Long addOrder(TOrderItemDTO tOrderItemDTO);


}
