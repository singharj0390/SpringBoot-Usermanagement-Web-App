package com.as.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.as.model.UserAccount;
import com.as.services.UserManagementService;

@Controller
public class UserController {
        
	     @Autowired
	    private UserManagementService umService;
	     
	     @GetMapping("/loadForm")
	     public String loadForm(Model model) {
	    	 UserAccount  user = new UserAccount();
	    	 Map<Integer, String> countryMap = umService.getAllCountries();
	    	 model.addAttribute("userAcc",user);
	    	 model.addAttribute("countries",countryMap);
	    	 return "addUser";
	     }
	     
	     @RequestMapping("/getStates")
	     @ResponseBody
	     public Map<Integer, String> getStatesByCountryId(@RequestParam("cid") Integer countryId){
	    	 return umService.getStatesByCountryId(countryId);
	     }
	     
	     @RequestMapping("/getCities")
	     @ResponseBody
	     public Map<Integer, String> getCitiesByStateId(@RequestParam("sid") Integer stateId){
	    	 return umService.getCitiesByStateId(stateId);
	     }
}
