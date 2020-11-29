package com.timecontrol.timecontrol.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "PROJECT")
public class Project {

    @Id
    @GeneratedValue(generator = "PROJECT_GENERATOR")
    @SequenceGenerator(name = "PROJECT_GENERATOR", sequenceName = "PROJECT_SEQUENCE", allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "project")
    private List<SubProject> subProject;

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
