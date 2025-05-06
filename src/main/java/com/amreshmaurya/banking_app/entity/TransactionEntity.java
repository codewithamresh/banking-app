package com.amreshmaurya.banking_app.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;

public class TransactionEntity {

    @Id
    @GeneratedValue
    private Long id;

    private Double amount;
    private String type; // DEBIT or CREDIT
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private AccountEntity account;
}
