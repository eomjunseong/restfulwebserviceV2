package com.example.restfulwebservice.user;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserDaoService service;


    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

    //생성
    @PostMapping("/users")
    public ResponseEntity createUser(@RequestBody  User user){
        User saveUser = service.save(user);


        //응답 코드 200->201 created
        URI location  = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(saveUser.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @GetMapping("/users/{id}")
    public User retrieveUser(@PathVariable int id){

        User findUser = service.findOne(id);

        if(findUser==null){
            throw new UserNotFoundException(String.format("ID[%d] not found",id));
        }

        return findUser;
    }

}
