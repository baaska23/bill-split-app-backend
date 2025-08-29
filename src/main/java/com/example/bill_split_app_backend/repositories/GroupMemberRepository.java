package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.GroupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupMemberRepository extends JpaRepository<GroupMember, Integer> {
}
