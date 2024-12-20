package com.neoteric.jpaconnection.jpaconnection.jpapractice;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employee",schema="sonar")
@Data
public class EmployeeEntity {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    @Column(name="dept")
    private String dept;

    @Column(name="salary")
    private int salary;

    @ManyToOne
    @JoinColumn(columnDefinition = "pid",referencedColumnName = "id")
   private  ProjectEntity projectEntity;


}
