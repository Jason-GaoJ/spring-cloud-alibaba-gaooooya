package com.cloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(GatewayApplication.class, args);
        System.out.println(applicationContext.getEnvironment().getProperty("msg"));
    }
}
