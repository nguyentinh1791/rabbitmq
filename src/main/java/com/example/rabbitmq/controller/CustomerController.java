package com.example.rabbitmq.controller;

import com.example.rabbitmq.model.CustomerDTO;
import com.example.rabbitmq.service.CustomerService;
import com.example.rabbitmq.service.impl.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCustomer")
    public void insertCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.insertCustomer(customerDTO);
    }

    @GetMapping("/getAll")
    List<CustomerDTO> getAll() {
        return customerService.getAll();
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
    }

}
