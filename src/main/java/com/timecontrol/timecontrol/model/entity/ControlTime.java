package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Column;
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
    @Column(name = "ID")
    private Long id;
    
	@OneToOne(fetch = FetchType.LAZY)
	private Project project;
	
	@OneToOne(fetch = FetchType.LAZY)
	private SubProject subProject;

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

	public void markDelete() {
		this.deleteDate = new Date();
	}
	
	public void markCancel() {
		this.deleteDate = new Date();
	}
}
