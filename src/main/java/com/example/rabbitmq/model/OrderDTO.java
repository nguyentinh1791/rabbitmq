package com.example.rabbitmq.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name = "vn_order")
public class OrderDTO  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    private int customer_id;
    private int product_id;
    private int quantity;
}
