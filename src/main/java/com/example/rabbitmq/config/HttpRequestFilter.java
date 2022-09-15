package com.example.rabbitmq.config;

import com.example.rabbitmq.model.UserDTO;
import com.example.rabbitmq.service.UserService;
import com.example.rabbitmq.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.*;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

public class HttpRequestFilter implements Filter {

    private FilterConfig filterConfig = null;

    @Autowired
    UserService userService;
    private final String hashReference = "user";
    private HashOperations hashOperations;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        //check login
//        UserDTO userDTO = new UserDTO();
//        Boolean login = (Boolean) hashOperations.get(hashReference,hashOperations);
//        if(login){
            chain.doFilter(request, response);
//        }

    }

}
