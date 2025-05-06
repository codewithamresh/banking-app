package com.amreshmaurya.banking_app.repository;

import com.amreshmaurya.banking_app.entity.TransactionEntity;
import com.amreshmaurya.banking_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public  interface TransactionRepository extends JpaRepository<TransactionEntity,Long> {
//    List<TransactionEntity> findByTransactionId(Long id);

}