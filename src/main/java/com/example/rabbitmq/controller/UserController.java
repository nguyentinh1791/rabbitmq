package com.example.rabbitmq.controller;

import com.example.rabbitmq.model.UserDTO;
import com.example.rabbitmq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;


    @GetMapping("/getAllUser")
    public List<UserDTO> fillAll() {
        return userService.fillAll();
    }

    @PostMapping("/saveUser")
    public void saveUser(@RequestBody UserDTO userDTO) {
        userService.saveUser(userDTO);
    }

    @PostMapping("/login")
    public boolean checkLogin(@RequestParam("username") String username, @RequestParam("password") String password) {
        return userService.checkLogin(username, password);
    }
}

//    @GetMapping("/logout")
//    public String logOut(HttpServletRequest request, HttpServletResponse response){
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        if(auth!=null){
//    }
//}
