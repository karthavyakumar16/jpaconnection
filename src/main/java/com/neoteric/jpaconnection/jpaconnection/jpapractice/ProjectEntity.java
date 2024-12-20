package com.neoteric.jpaconnection.jpaconnection.jpapractice;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="project",schema="sonar")
@Data
public class ProjectEntity {

    public  ProjectEntity(){

    }

    @Id
    @Column(name="id")
    private int id;
    @Column(name="pname")
    private String pname;

    @Column(name="startdate")
    private int startdate;

    @Column(name="enddate")
    private int enddate;
    @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL)
    private List<EmployeeEntity> employeeEntityList;



}
