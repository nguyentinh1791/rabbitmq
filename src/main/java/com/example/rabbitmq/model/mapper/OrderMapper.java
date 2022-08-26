package com.example.rabbitmq.model.mapper;

import com.example.rabbitmq.model.OrderDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapper extends JpaRepository<OrderDTO,Integer> {
}
