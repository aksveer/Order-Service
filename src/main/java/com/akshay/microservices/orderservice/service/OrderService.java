package com.akshay.microservices.orderservice.service;

import com.akshay.microservices.orderservice.model.OrderRequest;

public interface OrderService {
    Long placeOrder(OrderRequest orderRequest);
}
