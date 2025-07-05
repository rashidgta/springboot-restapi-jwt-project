package com.springboot.restapi.jwt.controller;

import com.springboot.restapi.jwt.model.User;
import com.springboot.restapi.jwt.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserServiceImpl userService;

    // http://localhost:8585/home/user
    @GetMapping("/users")
    public List<User> getUser(){

        return userService.getUsers();
    }
}
