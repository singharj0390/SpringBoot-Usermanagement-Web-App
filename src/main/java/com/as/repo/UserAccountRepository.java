package com.as.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.UserAccountEntity;

public interface UserAccountRepository extends JpaRepository<UserAccountEntity, Serializable> {
          
}
