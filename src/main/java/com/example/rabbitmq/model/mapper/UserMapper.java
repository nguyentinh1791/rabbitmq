package com.example.rabbitmq.model.mapper;

import com.example.rabbitmq.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserMapper extends JpaRepository<UserDTO, Integer>{
//    @Query("select u from UserDTO u")
    @Query("select u from UserDTO u where u.username = :username and u.password = :password")
    UserDTO findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    @Query("select u from UserDTO u where u.username = :username")
    UserDTO findByUsername(@Param("username") String username);
}
