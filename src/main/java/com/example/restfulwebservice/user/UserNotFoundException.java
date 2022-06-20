package com.example.restfulwebservice.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//200 OK
//400 client
//500 server
@ResponseStatus(HttpStatus.NOT_FOUND)//500->404
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {

        super(message);
        System.out.println("ERROR!!!");
    }
}
