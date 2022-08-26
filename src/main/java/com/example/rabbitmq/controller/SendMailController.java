package com.example.rabbitmq.controller;

import com.example.rabbitmq.dto.Email;
import com.example.rabbitmq.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMailController {
    @Autowired
    SendMailService sendMailService;

    @PostMapping("/sendMail")
    public String sendMail(@RequestBody Email email){
        return sendMailService.sendMail(email);
    }

    @PostMapping("/sendMailAttachment")
    public String sendMailAttachment(@RequestBody Email email){
        return sendMailService.sendMailAttachment(email);
    }
}
