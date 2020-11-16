package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EMPLOYEES")
public class Employees {
	
    @Id
    @GeneratedValue(generator = "EMPLOYEES_GENERATOR")
    @SequenceGenerator(name = "EMPLOYEES_GENERATOR", sequenceName = "EMPLOYEES_SEQUENCE", allocationSize = 1)
    private Long id;
    
    @OneToMany(fetch = FetchType.LAZY)
    private Person person;
    
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
