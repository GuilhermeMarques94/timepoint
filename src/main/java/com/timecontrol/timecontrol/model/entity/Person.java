package com.timecontrol.timecontrol.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class Person {
	
    @Id
    @GeneratedValue(generator = "PERSON_GENERATOR")
    @SequenceGenerator(name = "PERSON_GENERATOR", sequenceName = "PERSON_SEQUENCE", allocationSize = 1)
    private Long id;
    
    private String name;
    
    private String CPF;
    
    private String RG;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Contact> contact;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private List<Employees> employees;
    
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
