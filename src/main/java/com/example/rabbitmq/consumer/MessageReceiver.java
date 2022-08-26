package com.example.rabbitmq.consumer;

import com.example.rabbitmq.dto.MessageMQ;
import com.example.rabbitmq.model.OrderDTO;
import com.example.rabbitmq.service.SendMessageService;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

import static com.example.rabbitmq.service.Constant.ServiceConstant.CHARSET_NAME;

@Component
@Slf4j
public class MessageReceiver {
    @Autowired
    private SendMessageService sendMessageService;

    @RabbitListener(queues = "javainuse.queue", containerFactory = "multiListenerContainer")
    public void Order(MessageMQ message){

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setCustomer_id(message.getCustomer_id());
        orderDTO.setProduct_id(message.getProduct_id());
        orderDTO.setQuantity(message.getQuantity());

        log.info("get product cancel message from slp queue======>{}", message);
        sendMessageService.addOrder(orderDTO);
    }

}
