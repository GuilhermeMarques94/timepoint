package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ACCOUNT")
public class Account {
	
    @Id
    @GeneratedValue(generator = "ACCOUNT_GENERATOR")
    @SequenceGenerator(name = "ACCOUNT_GENERATOR", sequenceName = "ACCOUNT_SEQUENCE", allocationSize = 1)
    private Long id;
    
    private String account;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Bank bank;
	
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
	
	public void markDelelte() {
		this.deleteDate = new Date();

	}
	
	public void markCancel() {
		this.deleteDate = new Date();

	}

}
