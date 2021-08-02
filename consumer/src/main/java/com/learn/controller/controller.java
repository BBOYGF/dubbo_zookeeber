package com.learn.controller;

import com.learn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class controller {
    @Autowired
    UserService userService;

    @ResponseBody
    @GetMapping("/get")
    private String getTick()
    {

        return userService.buyTicker();
    }
}
