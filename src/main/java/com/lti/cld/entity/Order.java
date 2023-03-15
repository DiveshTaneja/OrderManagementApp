package com.lti.cld.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "orders_tbl")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {

	@Id
	@SequenceGenerator(name = "order_seq" ,initialValue = 5000, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "order_seq")
	private int orderId;
	
	private int productId;
	
	private String clientName;
	
	private int quantity;
	
	@CreationTimestamp
	private Timestamp createdDate;
	
	
	
	
}
