package com.timecontrol.timecontrol.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "PERSON")
public class Person {

    @Id
    @GeneratedValue(generator = "PERSON_GENERATOR")
    @SequenceGenerator(name = "PERSON_GENERATOR", sequenceName = "PERSON_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CPF")
    private String CPF;

    @Column(name = "RG")
    private String RG;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Contact> contact;

    @ManyToOne(fetch = FetchType.LAZY)
    private List<Employees> employees;

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
