package com.as.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "country_master")
public class CountryMasterEntity {
          
	       @Id
	       @GeneratedValue(strategy = GenerationType.AUTO)
	       @Column(name = "country_id")
	      private Integer countryId;
	       
	       @Column(name = "country_name")
	       private String countryName;
	       
	       @Column(name = "country_code")
	       private Integer countryCode;
}
