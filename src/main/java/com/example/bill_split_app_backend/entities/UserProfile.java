package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "user_profiles")
@NoArgsConstructor @Getter @Setter
public class UserProfile {
    @Id
    private Integer user_id;
    
    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
    private String bio;
    private String avatar_url;
    private Instant last_active;
    
    public UserProfile( User user, String bio, String avatar_url, Instant last_active) {
        this.user = user;
        this.bio = bio;
        this.avatar_url = avatar_url;
        this.last_active = last_active;
    }
}
