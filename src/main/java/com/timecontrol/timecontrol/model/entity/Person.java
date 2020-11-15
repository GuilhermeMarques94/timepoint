package com.timecontrol.timecontrol.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "PERSON")
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
