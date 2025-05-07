package com.amreshmaurya.banking_app.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public String getUserById(@PathVariable Long id){
        return "user of id :" + id;
    }
    @PutMapping("/{id}")
    public String updateUserById(@PathVariable Long id){
        return  "update user of id " + id;
    }
}
