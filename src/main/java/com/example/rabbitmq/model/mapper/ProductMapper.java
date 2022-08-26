package com.example.rabbitmq.model.mapper;

import com.example.rabbitmq.model.ProductDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper extends JpaRepository<ProductDTO, Integer> {
    @Query("SELECT p FROM ProductDTO p")
    List<ProductDTO> selectExample();
}
