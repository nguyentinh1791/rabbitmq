package com.example.rabbitmq.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "user", schema = "public")
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String username;
    private String password;
//    private String errMsg;
//    public UserDTO(String errMsg) {
//        this.errMsg = errMsg;
//    }
//
//    public UserDTO() {
//
//    }
}
