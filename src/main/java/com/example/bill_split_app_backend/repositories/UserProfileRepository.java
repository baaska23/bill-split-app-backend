package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProfileRepository extends JpaRepository<UserProfile, Integer> {
}
