package com.cxytiandi.sharding.controller;

import com.cxytiandi.sharding.dto.OrderDTO;
import com.cxytiandi.sharding.dto.TOrderItemDTO;
import com.cxytiandi.sharding.po.Order;
import com.cxytiandi.sharding.po.TOrderItem;
import com.cxytiandi.sharding.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping("/orders")
	public Object list() {
		return orderService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		for (long i = 0; i < 100; i++) {
			Order order = new Order();
			order.setId(i);
			order.setUserId(i);
			order.setMobile("18317043115");
			orderService.add(order);
		}
		return "success";
	}

    @GetMapping("/addOrder")
    public Object addOrder() {
        for (long i = 0; i < 100; i++) {
            TOrderItemDTO tOrderItemDTO = new TOrderItemDTO();
            tOrderItemDTO.setOrderId(i);
            tOrderItemDTO.setOrderItemId(i);
            tOrderItemDTO.setBrandCode((byte) i);
            orderService.addOrder(tOrderItemDTO);
        }
        return "success";
    }
	
	@GetMapping("/order/{id}")
	public Object get(@PathVariable Long id) {
		return orderService.findById(id,id);
	}
	@GetMapping("/getUserOrder/{id}")
	public Object getUserOrder(@PathVariable Long id) {
		OrderDTO orderDTO = new OrderDTO();
		orderDTO.setId(id);
		return orderService.findUserOrder(orderDTO);
	}

    @GetMapping("/findUserOrderNotLeftJoin/{userId}/{mobile}")
    public Object findUserOrderNotLeftJoin(@PathVariable Long userId,@PathVariable String mobile) throws Exception {
        return orderService.findUserOrderNotLeftJoin(userId,mobile);

    }

	@GetMapping("/getOrder/{id}/{brandCode}")
	public Object getOrder(@PathVariable Long id,@PathVariable Byte brandCode) {
		TOrderItem tOrderItem = new TOrderItem();
        tOrderItem.setOrderId(id);
        tOrderItem.setBrandCode(brandCode);
		return orderService.findOrder(tOrderItem);
	}
	
}
