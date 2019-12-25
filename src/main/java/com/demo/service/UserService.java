package com.demo.service;

import com.demo.entity.User;

import java.util.List;

public interface UserService {

    User queryUserById(Integer id);

    List<User> queryAllUser();
}
