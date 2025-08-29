package com.example.bill_split_app_backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name = "group_members")
@IdClass(GroupMemberId.class)
@NoArgsConstructor @Getter @Setter
public class GroupMember {
    
    @Id
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    
    private boolean is_admin;
    
    @CreationTimestamp
    private Instant joined_at;
    
    public GroupMember(Group group, User user, boolean is_admin) {
        this.group = group;
        this.user = user;
        this.is_admin = is_admin;
    }
}
