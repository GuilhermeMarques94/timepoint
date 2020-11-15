package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
public class Bank {
	
    @Id
    @GeneratedValue(generator = "BANK_GENERATOR")
    @SequenceGenerator(name = "BANK_GENERATOR", sequenceName = "BANK_SEQUENCE", allocationSize = 1)
    private Long id;
    
    private String bank;
    
	private Date createDate;
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	private Date updateDate;
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	private Date deleteDate;
	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}
	
	private Date cancelDate;
	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}
	
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
