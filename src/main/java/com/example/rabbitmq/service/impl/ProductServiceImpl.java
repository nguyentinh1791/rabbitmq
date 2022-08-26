package com.example.rabbitmq.service.impl;

import com.example.rabbitmq.model.ProductDTO;
import com.example.rabbitmq.model.mapper.ProductMapper;
import com.example.rabbitmq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<ProductDTO> fillAll() {
        return productMapper.findAll();
    }

    @Override
    public void saveProduct(ProductDTO productDTO){
        productMapper.save(productDTO);
    }

    @Override
    public void deleteProduct(Integer id){
        productMapper.deleteById(id);
    }

    @Override
    public List<ProductDTO> selectExample() {
        return productMapper.selectExample();
    }
}
