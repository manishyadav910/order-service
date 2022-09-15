package com.order.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.order.bean.Order;
import com.order.service.OrderService;

public class OrderResource {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(path="/orders")
	public boolean saveOrder(Order order)
	{
		return true;
	}

	@GetMapping(path="/orders/{id}")
	public Order findOrderById(Long id) {
		return null;
	}
	
}
