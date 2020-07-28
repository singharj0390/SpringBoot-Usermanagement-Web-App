package com.as.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.CountryMasterEntity;

public interface CountryMasterRepository extends JpaRepository<CountryMasterEntity, Serializable>{

}
