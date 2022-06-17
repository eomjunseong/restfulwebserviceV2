package com.example.restfulwebservice.user;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserDaoService service;


    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    @PostMapping("/users")
    public User createUser(User user){
        service.save(user);
        return user;
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){
        return service.findOne(id);
    }

}
