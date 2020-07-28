package com.as.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.StateMasterEntity;

public interface StatesMasterRepository extends JpaRepository<StateMasterEntity, Serializable>{
           
	public List<StateMasterEntity> findAllByCountryId(Integer countryId);

}
