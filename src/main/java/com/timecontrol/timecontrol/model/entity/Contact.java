package com.timecontrol.timecontrol.model.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.timecontrol.timecontrol.util.cpf.ContactType;

import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT")
public class Contact {
	
    @Id
    @GeneratedValue(generator = "CONTACT_GENERATOR")
    @SequenceGenerator(name = "CONTACT_GENERATOR", sequenceName = "CONTACT_SEQUENCE", allocationSize = 1)
    private Long id;
    
    
    @OneToMany(fetch = FetchType.LAZY)
    private Person person;
    
    private String description;
    
    public ContactType type;
	
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
