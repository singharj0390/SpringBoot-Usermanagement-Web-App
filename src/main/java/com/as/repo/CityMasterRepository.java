package com.as.repo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.as.entity.CityMasterEntity;

public interface CityMasterRepository extends JpaRepository<CityMasterEntity, Serializable>{
                            
	       public List<CityMasterEntity>  findAllCityByStateId(Integer stateId);
	       
}
