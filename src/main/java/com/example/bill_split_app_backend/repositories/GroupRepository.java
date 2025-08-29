package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
