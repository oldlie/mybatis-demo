package com.oldlie.example.demo.mybatis.model;

import lombok.*;

/**
 * @author oldlie
 * @date 2020/11/22
 */
@AllArgsConstructor
@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class User {
    private long id;
    private String username;
    private String password;
}
