package com.huzz.controller;

import com.huzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(){
        return "";
    }
}
