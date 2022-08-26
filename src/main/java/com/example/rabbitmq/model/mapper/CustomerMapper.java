package com.example.rabbitmq.model.mapper;

import com.example.rabbitmq.model.CustomerDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

public interface CustomerMapper extends JpaRepository<CustomerDTO, Integer> {
}
