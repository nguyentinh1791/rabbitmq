package com.example.rabbitmq.controller;

import com.example.rabbitmq.model.ProductDTO;
import com.example.rabbitmq.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/fillAllProduct")
    public List<ProductDTO> fillAll(){
        return productService.fillAll();
    }

    @PostMapping("/saveProduct")
    public void saveProduct(@RequestBody ProductDTO productDTO){
        productService.saveProduct(productDTO);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
    }

    @GetMapping("/selectExample")
    public List<ProductDTO> selectExample(){
        return productService.selectExample();
    }
}
