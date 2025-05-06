package com.amreshmaurya.banking_app.repository;

import com.amreshmaurya.banking_app.entity.AccountEntity;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository  extends JpaRepository< AccountEntity,Long> {
     List<AccountEntity> findByAccountId(Long accountId);
}