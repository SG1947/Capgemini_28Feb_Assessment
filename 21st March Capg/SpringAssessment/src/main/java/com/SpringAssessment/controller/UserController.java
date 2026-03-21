package com.SpringAssessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringAssessment.model.User;
import com.SpringAssessment.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") 
public class UserController {

    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public String register(@RequestBody User user) {
        String msg = userService.register(user);
        return msg;
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        String msg = userService.login(user.getUsername(), user.getPassword());
        return msg;
    }
}