package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Column;
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
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "CODE", nullable = false, length = 5, unique = true)
    private String code;

    @Column(name = "NAME", nullable = false, length = 80)
    private String name;
    
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
