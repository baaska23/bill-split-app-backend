package com.example.bill_split_app_backend.services;

import com.example.bill_split_app_backend.entities.Payment;
import com.example.bill_split_app_backend.repositories.PaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }
    
    public List<Payment> getPayments() {
        return paymentRepository.findAll();
    }
}
