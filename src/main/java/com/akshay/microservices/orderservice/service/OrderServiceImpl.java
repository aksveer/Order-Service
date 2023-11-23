package com.akshay.microservices.orderservice.service;

import com.akshay.microservices.orderservice.entity.Order;
import com.akshay.microservices.orderservice.model.OrderRequest;
import com.akshay.microservices.orderservice.repository.OrderRepository;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public Long placeOrder(OrderRequest orderRequest) {
        log.info("Placing order for {}", orderRequest);
        Order order = Order.builder()
                .productId(orderRequest.getProductId())
                .quantity(orderRequest.getQuantity())
                .orderStatus(orderRequest.getOrderStatus())
                .amount(orderRequest.getAmount())
                .orderDate(Instant.now())
                .build();
        order = orderRepository.save(order);

        log.info("Order placed for {}", order);
        return order.getId();

    }
}
