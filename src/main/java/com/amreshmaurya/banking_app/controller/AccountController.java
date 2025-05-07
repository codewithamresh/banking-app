package com.amreshmaurya.banking_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    @GetMapping("{id}")
    public  String  getAccountById(@PathVariable Long id){
        return  "get account of id : " + id;
    }
    @DeleteMapping("{id}")
    public String deleteAccountById(@PathVariable Long id){
        return  "delete user by id : " + id;
    }
    @GetMapping("/user/{userId}")
    public String getAllAccountsOfUserById(@PathVariable Long userId){
    return  "get all account of: " + userId ;
    }
}
