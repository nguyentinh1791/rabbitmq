package com.example.rabbitmq.service;

import com.example.rabbitmq.model.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> fillAll();

    void saveUser(UserDTO userDTO);

    boolean checkLogin(String username, String password);

}
