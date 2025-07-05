package com.springboot.restapi.jwt.service;

import com.springboot.restapi.jwt.Model.User;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class UserServiceImpl implements UserService{

    private List<User> list = new ArrayList<>();

    public UserServiceImpl() {
        list.add(new User(UUID.randomUUID().toString(),"Rashid Rana", "rashid.gta@gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Aamir Kamal","aamir.kamaal @gmail.com"));
        list.add(new User(UUID.randomUUID().toString(),"Owais Rana","owais.rana2013@gmail.com"));
    }

    public List<User> getUsers() {

        return list;
    }
}
