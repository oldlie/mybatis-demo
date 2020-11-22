package com.oldlie.example.demo.mybatis.service.impl;

import com.oldlie.example.demo.mybatis.mapper.UserMapper;
import com.oldlie.example.demo.mybatis.model.User;
import com.oldlie.example.demo.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author oldlie
 * @date 2020/11/22
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return this.userMapper.getAllUser();
    }

    @Override
    public Integer addUser(User user) {
        return this.userMapper.addUser(user);
    }

}
