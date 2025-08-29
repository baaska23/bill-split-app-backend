package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.BillParticipant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillParticipantRepository extends JpaRepository<BillParticipant, Integer> {
}
