package com.example.bill_split_app_backend.entities;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@EqualsAndHashCode
public class BillParticipantId implements Serializable {
    private Integer bill;
    private Integer user;
}
