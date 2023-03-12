package com.lti.cld.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.cld.entity.Order;

@Repository
public class OrdersDaoImpl implements OrdersDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Order> getOrdersFromProductId(int productId) {
		String jpql = "select o from Order o where product_id =:productId" ;
		TypedQuery<Order> query = entityManager.createQuery(jpql, Order.class);
		query.setParameter("productId", productId);
		
		return query.getResultList();
	}

	@Transactional
	public Order addOrder(Order order) {
		return entityManager.merge(order);
	}

}
