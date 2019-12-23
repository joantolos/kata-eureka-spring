package com.joantolos.kata.eureka.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaEU {

    public static void main(String[] args) {
        SpringApplication.run(EurekaEU.class, args);
    }
}
