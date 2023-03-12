package com.lti.cld.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.cld.entity.Order;

@Service
public interface OrdersService {

	public List<Order> getOrderByProductId(int productId);
	
	public Order saveOrder(Order order);
}
