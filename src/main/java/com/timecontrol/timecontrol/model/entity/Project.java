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
@Table(name = "PROJECT")
public class Project {

	@Id
	@GeneratedValue(generator = "PROJECT_GENERATOR")
	@SequenceGenerator(name = "PROJECT_GENERATOR", sequenceName = "PROJECT_SEQUENCE", allocationSize = 1)
	private Long id;

	@Column(name = "NAME", nullable = false, length = 5, unique = true)
	private String name;

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
