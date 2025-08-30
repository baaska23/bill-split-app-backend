package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.User;
import com.example.bill_split_app_backend.entities.UserProfile;
import com.example.bill_split_app_backend.repositories.UserProfileRepository;
import com.example.bill_split_app_backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final UserProfileRepository userProfileRepository;
    
    public UserService(UserRepository userRepository, UserProfileRepository userProfileRepository) {
        this.userRepository = userRepository;
        this.userProfileRepository = userProfileRepository;
    }
    
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    
    public List<UserProfile> getUserProfiles() {
        return userProfileRepository.findAll();
    }
    
    public User saveUserData(User user) {
        return userRepository.save(user);
    }
    
    public User isUserExist(String email) {
        return userRepository.findByEmail(email);
    }
}
