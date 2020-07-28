package com.as.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "user_account")
public class UserAccountEntity {
           
	       @Id
	       @GeneratedValue(strategy = GenerationType.AUTO)
	       @Column(name = "user_id")
	       private Integer userId;
	       
	       @Column(name = "first_name")
	       private String firstName;
	       
	       @Column(name = "last_name")
	       private String lastName;
	       
	       @Column(name = "email",  nullable = false)
	       private String email;
	       
	       @Column(name = "phone_number", nullable = false)
	       private String phoneNo;
	       
	       @Column(name = "gender")
	       private String gender;
	       
	       @Column(name = "date_of_birth")
	       private Date dob;
	       
	       @Column(name = "account_status")
	       private String acctStatus;
	       
	       @Column(name = "password", nullable = false)
	       private String pwd;
	       
	       @CreationTimestamp
	       @Temporal(TemporalType.DATE)
	       @Column(name = "created_date")
	       private Date createdDate;
	       
	        @UpdateTimestamp
	        @Temporal(TemporalType.DATE)
	        @Column(name = "updated_date")
	       private Date updatedDate;
	       
	        @Column(name = "country_id")
	        private Integer countryId;
	        
	        @Column(name = "state_id")
	        private Integer stateId;
	        
	        @Column(name = "city_id")
	        private Integer cityId;
	        
	        
	        
}
