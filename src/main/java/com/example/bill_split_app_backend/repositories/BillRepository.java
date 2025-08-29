package com.example.bill_split_app_backend.repositories;

import com.example.bill_split_app_backend.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillRepository extends JpaRepository<Bill, Integer> {
}
