package com.amreshmaurya.banking_app.repository;

import com.amreshmaurya.banking_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
//List<UserEntity>  findByUserId(Long id);
//List<UserEntity> findByEmail(String email);
}