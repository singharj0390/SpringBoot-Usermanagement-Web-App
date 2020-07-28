package com.as.services;

import java.util.Map;

public interface UserManagementService {
                  
	     public Map<Integer, String> getAllCountries();
	     public Map<Integer, String> getStatesByCountryId(Integer countryId);
	     public Map<Integer, String> getCitiesByStateId(Integer stateId);
}
