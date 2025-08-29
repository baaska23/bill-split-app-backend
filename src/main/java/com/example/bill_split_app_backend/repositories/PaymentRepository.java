package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
