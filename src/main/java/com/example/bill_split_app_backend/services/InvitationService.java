package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.Invitation;
import com.example.bill_split_app_backend.repositories.InvitationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationService {
    private final InvitationRepository invitationRepository;
    
    public InvitationService(InvitationRepository invitationRepository) {
        this.invitationRepository = invitationRepository;
    }
    
    public List<Invitation> getInvitations() {
        return invitationRepository.findAll();
    }
}
