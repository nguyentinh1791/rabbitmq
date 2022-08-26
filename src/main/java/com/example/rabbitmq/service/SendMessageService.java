package com.example.rabbitmq.service;


import com.example.rabbitmq.model.MessageDTO;
import com.example.rabbitmq.model.OrderDTO;

public interface SendMessageService {

//    public void addOrder(String jsonString);

    void addOrder(OrderDTO orderDTO);
}
