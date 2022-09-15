package com.order.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.order.bean.OrderItem;

public interface OrderDao extends JpaRepository<OrderItem, Long> {

}
