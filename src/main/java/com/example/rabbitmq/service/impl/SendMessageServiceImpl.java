package com.example.rabbitmq.service.impl;

import com.example.rabbitmq.model.OrderDTO;
import com.example.rabbitmq.model.mapper.OrderMapper;
import com.example.rabbitmq.service.SendMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SendMessageServiceImpl implements SendMessageService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public void addOrder(OrderDTO orderDTO){
        orderMapper.save(orderDTO);
    }

}
