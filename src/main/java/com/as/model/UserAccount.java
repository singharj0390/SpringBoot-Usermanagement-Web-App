package com.as.model;

import java.util.Date;

import lombok.Data;


@Data
public class UserAccount {
         
	private Integer userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNo;
	private String gender;
	private Date dob;
	private String accStatus;
	private String pwd;
	private Date createdDate;
	private Date updatedDate;
	private Integer countryId;
	private Integer stateId;
	private Integer cityId;
	
	
	
	
	
}
