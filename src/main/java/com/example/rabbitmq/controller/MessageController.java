package com.example.rabbitmq.controller;

import com.example.rabbitmq.dto.MessageMQ;
import com.example.rabbitmq.model.OrderDTO;
import com.example.rabbitmq.service.SendMessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MessageController {
    @Autowired
    SendMessageService sendMessageService;

    @Value("${javainuse.rabbitmq.queue}")
    String queueName;
    @Value("${javainuse.rabbitmq.exchange}")
    private String exchange;

    @Value("${javainuse.rabbitmq.routingkey}")
    private String routingkey;


    @Autowired
    private AmqpTemplate rabbitTemplate;

    @PostMapping("/send")
    public String send(@RequestBody MessageMQ messageMQ) {
        rabbitTemplate.convertAndSend(exchange, routingkey, messageMQ);
        return "Success";
    }

}
