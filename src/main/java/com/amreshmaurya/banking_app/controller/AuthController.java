package com.amreshmaurya.banking_app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public  String RegisterUser(){
        return "User Registered";
    }

    @PostMapping("/login")
    public String LoginUser(){
        return "User Login Successfully";
    }
}
