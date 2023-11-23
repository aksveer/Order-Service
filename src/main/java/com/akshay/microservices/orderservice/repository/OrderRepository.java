package com.akshay.microservices.orderservice.repository;

import com.akshay.microservices.orderservice.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
