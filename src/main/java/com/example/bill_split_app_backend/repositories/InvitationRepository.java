package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvitationRepository extends JpaRepository<Invitation, Integer> {
}
