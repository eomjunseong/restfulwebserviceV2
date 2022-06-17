package com.example.restfulwebservice.helloworld;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;

@Data
@AllArgsConstructor // 전체 생성자
@NoArgsConstructor //defualt
public class HelloWorldBean {
    private String message;
}
