package com.oldlie.example.demo.mybatis.mapper;

import com.oldlie.example.demo.mybatis.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author oldlie
 * @date 2020/11/22
 */
@Mapper
public interface UserMapper {

    List<User> getAllUser();

    Integer addUser(User user);

    Integer updateUserById(User user);

    Integer deleteUserById(Integer id);
}
