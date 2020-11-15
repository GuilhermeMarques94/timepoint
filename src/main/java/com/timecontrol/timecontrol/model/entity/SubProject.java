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
@Table(name = "SUBPROJECT")
public class SubProject {
	
    @Id
    @GeneratedValue(generator = "SUB_PROJECT_GENERATOR")
    @SequenceGenerator(name = "SUB_PROJECT_GENERATOR", sequenceName = "SUB_PROJECT_SEQUENCE", allocationSize = 1)
    private Long id;
    
    @Column(name = "NAME", nullable = false, length = 5, unique = true)
    private String name;
 
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROJECT", referencedColumnName = "ID", nullable = false)
    private List<Project> project;
    
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
