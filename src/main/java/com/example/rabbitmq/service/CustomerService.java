package com.example.rabbitmq.service;

import com.example.rabbitmq.model.CustomerDTO;

import java.util.List;


public interface CustomerService {
    void insertCustomer(CustomerDTO customerDTO);

    List<CustomerDTO> getAll();

    void deleteCustomer(Integer id);
}
