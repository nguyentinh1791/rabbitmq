package com.example.rabbitmq.service.impl;

import com.example.rabbitmq.model.CustomerDTO;
import com.example.rabbitmq.model.mapper.CustomerMapper;
import com.example.rabbitmq.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerServiceImp implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;

    @Override
    public void insertCustomer(CustomerDTO customerDTO) {
        customerMapper.save(customerDTO);
    }

    @Override
    public List<CustomerDTO> getAll() {
        return customerMapper.findAll();
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerMapper.deleteById(id);
    }
}
