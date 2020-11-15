package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
public class Employees {
	
    @Id
    @GeneratedValue(generator = "EMPLOYEES_GENERATOR")
    @SequenceGenerator(name = "EMPLOYEES_GENERATOR", sequenceName = "EMPLOYEES_SEQUENCE", allocationSize = 1)
    private Long id;
    
    @OneToMany(fetch = FetchType.LAZY)
    private Person person;
    
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
