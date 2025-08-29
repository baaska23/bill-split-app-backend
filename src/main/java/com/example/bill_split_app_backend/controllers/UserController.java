package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.User;
import com.example.bill_split_app_backend.entities.UserProfile;
import com.example.bill_split_app_backend.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("/user-profiles")
    public List<UserProfile> getUserProfiles() {
        return userService.getUserProfiles();
    }
}