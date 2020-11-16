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
@Table(name = "CONTROL_TIME")
public class ControlTime {

    @Id
    @GeneratedValue(generator = "CONTROL_TIME_GENERATOR")
    @SequenceGenerator(name = "CONTROL_TIME_GENERATOR", sequenceName = "CONTROL_TIME__SEQUENCE", allocationSize = 1)
    private Long id;
    
	@OneToOne(fetch = FetchType.LAZY)
	private Project project;
	
	@OneToOne(fetch = FetchType.LAZY)
	private SubProject subProject;
	
	
	
    
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
