package com.example.petshop.login;

import com.example.petshop.user.User;
import com.example.petshop.user.UserMapper;
import com.example.petshop.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;


    public LoginResponse login(String name, String password) {
        User user = userService.getValidUser(name, password);
        LoginResponse loginResponse = userMapper.toLoginResponse(user);
        return loginResponse;
    }
}
