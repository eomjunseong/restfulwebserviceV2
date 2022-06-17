package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET
    //
    @GetMapping("/hello-world")
    public String helloWorld(){
        return "helloworld"; // 단순 스트링으로 반환
    }
    //객체 반환
    //자바 빈 형태 반환 -> JSON 으로 바껴서 반환
    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hello~");
    }

    @GetMapping("/hello-world/path_variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello world %s", name));
    }
}
