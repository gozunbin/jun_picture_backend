package com.jun.jun_picture_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.jun.jun_picture_backend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class JunPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunPictureBackendApplication.class, args);
    }

}
