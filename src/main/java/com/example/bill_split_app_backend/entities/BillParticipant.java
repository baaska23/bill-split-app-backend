package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "bill_participant")
@IdClass(BillParticipantId.class)
@NoArgsConstructor @Getter @Setter
public class BillParticipant {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "bill_id")
    private Bill bill;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private double shared_amount;
    private boolean is_paid;
    
    public BillParticipant(Bill bill, User user, double shared_amount, boolean is_paid) {
        this.bill = bill;
        this.user = user;
        this.shared_amount = shared_amount;
        this.is_paid = is_paid;
    }
}
