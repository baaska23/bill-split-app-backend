package com.example.bill_split_app_backend.entities;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public class GroupMemberId implements Serializable {
    private Integer group;
    private Integer user;
}
