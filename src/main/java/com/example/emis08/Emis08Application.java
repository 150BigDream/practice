package com.example.emis08;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.emis08.mapper")
@SpringBootApplication
public class Emis08Application {

    public static void main(String[] args) {
        SpringApplication.run(Emis08Application.class, args);
    }

}
