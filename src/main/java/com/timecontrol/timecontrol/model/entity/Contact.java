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

import com.timecontrol.timecontrol.enumerator.ContactType;

import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT")
public class Contact {
	
    @Id
    @GeneratedValue(generator = "CONTACT_GENERATOR")
    @SequenceGenerator(name = "CONTACT_GENERATOR", sequenceName = "CONTACT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;
    
    @OneToMany(fetch = FetchType.LAZY)
    private Person person;
    
    @Column(name = "DESCRIPTION")
    private String description;
    
    @Column(name = "TYPE")
    public ContactType type;
	
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
