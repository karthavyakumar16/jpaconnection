package com.neoteric.jpaconnection.jpaconnection.jpademo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "project", schema = "sonar")
@Data
public class Project {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "pname")
    private String name;

    @Column(name = "startdate",nullable = false)
    private Date startDate;
    @Column(name = "enddate",nullable = false)
    private Date endDate;

    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Employee> employees;

    public Project() {

    }

}
