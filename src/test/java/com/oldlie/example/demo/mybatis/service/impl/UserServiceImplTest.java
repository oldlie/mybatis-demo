package com.oldlie.example.demo.mybatis.service.impl;

import com.oldlie.example.demo.mybatis.model.User;
import com.oldlie.example.demo.mybatis.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author oldlie
 * @date 2020/11/22
 */
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;


    @Test
    public void findAll() {
        List<User> list =this.userService.findAll();
        System.out.println(list);
        Assert.isTrue(!list.isEmpty(), "没有数据");
    }

    @Test
    public void add() {
        User user = new User();
        user.setId(0);
        user.setUsername("test");
        user.setPassword("password");
        int impactRow = this.userService.addUser(user);
        System.out.println(impactRow);

        Assert.isTrue(impactRow == 1, "id?");
    }

}