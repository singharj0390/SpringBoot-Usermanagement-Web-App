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
@Table(name = "city_master")
public class CityMasterEntity {
        
	     @Id
	     @GeneratedValue(strategy = GenerationType.AUTO)
	     @Column(name = "city_id")
	     private Integer cityId;
	     
	     @Column(name="state_id")
	     private Integer stateId;
	     
	     @Column(name = "city_name")
	     private String cityName;
}
