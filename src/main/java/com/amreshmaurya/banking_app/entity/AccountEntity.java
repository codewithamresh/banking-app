package com.amreshmaurya.banking_app.entity;

import jakarta.persistence.*;
import java.util.List;

public class AccountEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String accountNumber;
    private Double balance;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    @OneToMany(mappedBy = "account")
    private List<TransactionEntity> transactions;

}
