package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.User;
import com.example.bill_split_app_backend.entities.UserProfile;
import com.example.bill_split_app_backend.repositories.UserRepository;
import com.example.bill_split_app_backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;
    private final UserRepository userRepository;
    
    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }
    
    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    
    @GetMapping("/user-profiles")
    public List<UserProfile> getUserProfiles() {
        return userService.getUserProfiles();
    }
    
    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUserData(user);
        return ResponseEntity.ok(savedUser);
    }
    
    @GetMapping("/users/isExist")
    public boolean isUserExist(@RequestParam String email) {
        System.out.println("Received email: " + email);
        User user = userService.isUserExist(email);
        System.out.println("Found user: " + (user != null));
        return user != null;
    }
}