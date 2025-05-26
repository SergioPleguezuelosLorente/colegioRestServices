package com.escuela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.escuela.proxy")
public class ColegioApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColegioApplication.class, args);
    }

}
