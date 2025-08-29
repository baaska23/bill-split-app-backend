package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.Invitation;
import com.example.bill_split_app_backend.services.InvitationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InvitationController {
    private final InvitationService invitationService;
    
    public InvitationController(InvitationService invitationService) {
        this.invitationService = invitationService;
    }
    
    @GetMapping("/invitations")
    public List<Invitation> getInvitations() {
        return invitationService.getInvitations();
    }
}