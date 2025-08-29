package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.Group;
import com.example.bill_split_app_backend.entities.GroupMember;
import com.example.bill_split_app_backend.repositories.GroupMemberRepository;
import com.example.bill_split_app_backend.repositories.GroupRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    private final GroupRepository groupRepository;
    private final GroupMemberRepository groupMemberRepository;
    
    public GroupService(GroupRepository groupRepository, GroupMemberRepository groupMemberRepository) {
        this.groupRepository = groupRepository;
        this.groupMemberRepository = groupMemberRepository;
    }
    
    public List<Group> getGroups() {
        return groupRepository.findAll();
    }
    
    public List<GroupMember> getGroupMembers() {
        return groupMemberRepository.findAll();
    }
}
