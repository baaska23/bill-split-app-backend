package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.Bill;
import com.example.bill_split_app_backend.entities.BillParticipant;
import com.example.bill_split_app_backend.services.BillService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BillController {
    private final BillService billService;
    
    public BillController(BillService billService) {
        this.billService = billService;
    }
    
    @GetMapping("/bills")
    public List<Bill> getBills() {
        return billService.getBills();
    }
    
    @GetMapping("/bill-participants")
    public List<BillParticipant> getBillParticipants() {
        return billService.getBillParticipants();
    }
}