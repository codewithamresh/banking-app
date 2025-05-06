package com.amreshmaurya.banking_app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<AccountEntity> accounts;
}
