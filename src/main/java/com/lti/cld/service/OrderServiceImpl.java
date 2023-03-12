package com.lti.cld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.cld.dao.OrdersDao;
import com.lti.cld.entity.Order;

@Service
public class OrderServiceImpl implements OrdersService {

	@Autowired
	OrdersDao orderDao;
	
	public List<Order> getOrderByProductId(int productId) {
		return orderDao.getOrdersFromProductId(productId);
	}

	@Override
	public Order saveOrder(Order order) {
		return orderDao.addOrder(order);
	}

}
