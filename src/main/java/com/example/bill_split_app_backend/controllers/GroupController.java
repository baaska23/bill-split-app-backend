package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.Group;
import com.example.bill_split_app_backend.entities.GroupMember;
import com.example.bill_split_app_backend.services.GroupService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GroupController {
    private final GroupService groupService;
    
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }
    
    @GetMapping("/groups")
    public List<Group> getGroups() {
        return groupService.getGroups();
    }
    
    @GetMapping("/group-members")
    public List<GroupMember> getGroupMembers() {
        return groupService.getGroupMembers();
    }
}