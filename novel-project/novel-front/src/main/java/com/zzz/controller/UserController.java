package com.zzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "123456";
    }

    @RequestMapping("/to")
    public String to() {
        return "redirect:/main.html";
    }

}
