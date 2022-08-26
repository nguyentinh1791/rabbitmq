package com.example.rabbitmq.service.impl;

import com.example.rabbitmq.model.UserDTO;
import com.example.rabbitmq.model.mapper.UserMapper;
import com.example.rabbitmq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    private final String hashReference = "user";

    @Autowired
    RedisTemplate<String, Object> redisTemplate;
    private HashOperations hashOperations;

    public UserServiceImpl(RedisTemplate redisTemplate) {
        this.hashOperations = redisTemplate.opsForHash();
    }
    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public List<UserDTO> fillAll() {
        return userMapper.findAll();
    }

    @Override
    public void saveUser(UserDTO userDTO) {
        UserDTO userDTO1 = new UserDTO();
        userDTO1.setUsername(userDTO.getUsername());
        userDTO1.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        userMapper.save(userDTO1);
    }

    @Override
    public boolean checkLogin(String username, String password){
        UserDTO loginUser = userMapper.findByUsername(username);
        boolean check = passwordEncoder.matches(password, loginUser.getPassword());
        hashOperations.put(hashReference, "1231231", check);
        return passwordEncoder.matches(password, loginUser.getPassword());
    }
}
