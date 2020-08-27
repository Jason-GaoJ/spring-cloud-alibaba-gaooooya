package com.cloud.alibaba.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason
 * @date 2020/7/31 17:49
 * @description
 */
@RestController
public class UserController {

    @RequestMapping("/user")
    public String user(){
        return "gaooooya";
    }
}
