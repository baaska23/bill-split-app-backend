package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.Bill;
import com.example.bill_split_app_backend.entities.BillParticipant;
import com.example.bill_split_app_backend.repositories.BillParticipantRepository;
import com.example.bill_split_app_backend.repositories.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {
    private final BillRepository billRepository;
    private final BillParticipantRepository billParticipantRepository;
    
    public BillService(BillRepository billRepository, BillParticipantRepository billParticipantRepository) {
        this.billRepository = billRepository;
        this.billParticipantRepository = billParticipantRepository;
    }
    
    public List<Bill> getBills() {
        return billRepository.findAll();
    }
    
    public List<BillParticipant> getBillParticipants() {
        return billParticipantRepository.findAll();
    }
}
