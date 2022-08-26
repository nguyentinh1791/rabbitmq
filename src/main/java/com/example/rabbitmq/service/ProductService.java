package com.example.rabbitmq.service;

import com.example.rabbitmq.model.ProductDTO;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductService {
    List<ProductDTO> fillAll();

    void saveProduct(ProductDTO productDTO);

    void deleteProduct(Integer id);

    List<ProductDTO> selectExample();
}
