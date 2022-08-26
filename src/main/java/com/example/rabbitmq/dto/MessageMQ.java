package com.example.rabbitmq.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
public class MessageMQ implements Serializable {
    private int order_id;
    private int customer_id;
    private int product_id;
    private int quantity;
}
