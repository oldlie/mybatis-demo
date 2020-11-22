package com.oldlie.example.demo.mybatis.service;

import com.oldlie.example.demo.mybatis.model.User;

import java.util.List;

/**
 * @author oldlie
 * @date 2020/11/22
 */
public interface UserService {

    List<User> findAll();

    Integer addUser(User user);
}
