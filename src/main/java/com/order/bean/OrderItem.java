package com.order.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class OrderItem {

	@Id
	private Long id;
	private Long productId;
	private int quantity;
	private Double productPrice;
	
}
