package com.group7.isgroup7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HTMLController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("register")
    public String register(){
        return "/register.html";
    }
}
