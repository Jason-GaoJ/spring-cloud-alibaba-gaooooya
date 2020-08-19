package com.cloud.alibaba;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class GatewayApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext=SpringApplication.run(GatewayApplication.class, args);
        while (true){
            System.out.println(applicationContext.getEnvironment().getProperty("msg"));
            Thread.sleep(2000);
        }

    }
}
