package com.lti.cld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.cld.entity.Order;
import com.lti.cld.service.OrdersService;

@RestController
@RequestMapping("/orders-management")
@CrossOrigin("*")
public class OrdersController {

	@Autowired
	OrdersService ordersService;
	
	@GetMapping("/product/{productId}")
	public List<Order> getOrdersByProductId(@PathVariable int productId){
		return ordersService.getOrderByProductId(productId);
	}
	
	@PostMapping("/order")
	public Order addOrder(@RequestBody Order order) {
		return ordersService.saveOrder(order);
	}
}
