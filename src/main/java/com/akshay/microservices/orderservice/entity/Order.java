package com.akshay.microservices.orderservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Entity
@Table(name = "ORDER_DETAILS")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "PRODUCT_ID")
    private Long productId;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "ORDER_DATE")
    private Instant orderDate;
    @Column(name = "ORDER_STATUS")
    private String orderStatus;
    @Column(name = "AMOUNT")
    private Long amount;
}
