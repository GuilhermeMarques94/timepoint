package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
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
