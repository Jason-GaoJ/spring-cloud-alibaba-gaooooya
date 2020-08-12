package com.cloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jason
 * @date 2020/7/10 18:56
 * @description
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/getUserMsg")
    public String getUserMsg(){
        return "gaooooya";
    }
}
