package com.example.bill_split_app_backend.controllers;

import com.example.bill_split_app_backend.entities.Payment;
import com.example.bill_split_app_backend.services.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentController {
    private final PaymentService paymentService;
    
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    @GetMapping("/payments")
    public List<Payment> getPayments() {
        return paymentService.getPayments();
    }
}