package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Column;
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
    @Column(name = "ID")
    private Long id;
    
    @OneToMany(fetch = FetchType.LAZY)
    @Column(name = "PERSON")
    private Person person;
    
    @Column(name = "CREATE_DATE")
	private Date createDate;

    @Column(name = "UPDATE_DATE")
	private Date updateDate;

    @Column(name = "DELETE_DATE")
	private Date deleteDate;

    @Column(name = "CANCEL_DATE")
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
