package com.timecontrol.timecontrol.model.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "SUB_PROJECT")
public class SubProject {
	
    @Id
    @GeneratedValue(generator = "SUB_PROJECT_GENERATOR")
    @SequenceGenerator(name = "SUB_PROJECT_GENERATOR", sequenceName = "SUB_PROJECT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "NAME")
    private String name;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT", referencedColumnName = "ID", nullable = false)
    private List<Project> project;
    
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
