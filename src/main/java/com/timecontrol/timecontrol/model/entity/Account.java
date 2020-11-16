package com.timecontrol.timecontrol.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "ACCOUNT")
public class Account {

    @Id
    @GeneratedValue(generator = "ACCOUNT_GENERATOR")
    @SequenceGenerator(name = "ACCOUNT_GENERATOR", sequenceName = "ACCOUNT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "ACCOUNT")
    private String account;

    @OneToOne(fetch = FetchType.LAZY)
    private Bank bank;

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
