package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "invitations")
@NoArgsConstructor @Getter @Setter
public class Invitation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int invite_id;
    
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    
    @ManyToOne
    @JoinColumn(name = "invited_user_id")
    private User user;
    
    private String invite_code;
    private String status;
    
    @CreationTimestamp
    private Instant created_at;
    
    public Invitation(Group group, User user, String invite_code, String status) {
        this.group = group;
        this.user = user;
        this.invite_code = invite_code;
        this.status = status;
    }
}
