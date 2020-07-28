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
@Table(name = "state_master")
public class StateMasterEntity {
       
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "state_id")
	  private Integer stateId;
      
    @Column(name = "country_id")
    private Integer countryId;
    
    @Column(name = "state_name")
    private String stateName;
    
}
