package com.lti.cld.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.cld.entity.Order;

@Repository
public interface OrdersDao {

	public List<Order> getOrdersFromProductId(int productId);
	
	public Order addOrder(Order order);
}
