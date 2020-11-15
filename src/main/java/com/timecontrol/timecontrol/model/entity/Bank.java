package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BANK")
public class Bank {
	
    @Id
    @GeneratedValue(generator = "BANK_GENERATOR")
    @SequenceGenerator(name = "BANK_GENERATOR", sequenceName = "BANK_SEQUENCE", allocationSize = 1)
    private Long id;
    
    private String bank;
    
	private Date createDate;

	private Date updateDate;

	private Date deleteDate;

	private Date cancelDate;

	public void markCreate() {
		this.createDate = new Date();

	}

	public void markUpdate() {
		this.updateDate = new Date();

	}
	
	public void markDeelte() {
		this.deleteDate = new Date();

	}
	
	public void markCancel() {
		this.deleteDate = new Date();

	}
    
}
