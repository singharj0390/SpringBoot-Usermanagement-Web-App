package com.as.services;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.entity.CityMasterEntity;
import com.as.entity.CountryMasterEntity;
import com.as.entity.StateMasterEntity;
import com.as.repo.CityMasterRepository;
import com.as.repo.CountryMasterRepository;
import com.as.repo.StatesMasterRepository;

@Service
public class UserManagementServiceImpl implements UserManagementService {
                            
	      @Autowired
	      private CountryMasterRepository cmRepo;
	      
	      @Autowired
	      private StatesMasterRepository smRepo;
	       
	     @Autowired
	     private CityMasterRepository cityRepo;
	     
	@Override
	public Map<Integer, String> getAllCountries() {
		Map<Integer, String> map = new LinkedHashMap();
		 List<CountryMasterEntity> countryList = cmRepo.findAll();
		 countryList.forEach(countryEntity->{
			 map.put(countryEntity.getCountryId(), countryEntity.getCountryName());
		 });
		return map;
	}

	@Override
	public Map<Integer, String> getStatesByCountryId(Integer countryId) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
	        List<StateMasterEntity> states = smRepo.findAllByCountryId(countryId);
	        states.forEach(stateEntity->{
	        	map.put(stateEntity.getStateId(), stateEntity.getStateName());
	        });
		return map;
	}

	@Override
	public Map<Integer, String> getCitiesByStateId(Integer stateId) {
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		List<CityMasterEntity> cities = cityRepo.findAllCityByStateId(stateId);
		cities.forEach(cityEntity->{
			map.put(cityEntity.getCityId(), cityEntity.getCityName());
		});
		return map;
	}

}
