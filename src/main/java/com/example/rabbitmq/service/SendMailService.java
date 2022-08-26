package com.example.rabbitmq.service;

import com.example.rabbitmq.dto.Email;

public interface SendMailService {
    String sendMail(Email email);

    String sendMailAttachment(Email email);
}
