package com.akshay.microservices.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequest {
    private Long productId;
    private Long quantity;
    private String orderStatus;
    private Long amount;
    private PAYMENT_MODE paymentMode;
}
