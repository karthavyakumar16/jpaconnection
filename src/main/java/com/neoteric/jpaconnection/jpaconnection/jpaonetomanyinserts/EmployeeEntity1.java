package com.neoteric.jpaconnection.jpaconnection.jpaonetomanyinserts;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="employee",schema="sonar")
@Data

public class EmployeeEntity1 {

        public EmployeeEntity1(){

        }


        @Id
        @Column(name="id")
        private int id;
        @Column(name="name")
        private String name;

        @Column(name="dept")
        private String dept;

        @Column(name="salary")
        private double salary;

        @ManyToOne
        @JoinColumn(columnDefinition = "pid",referencedColumnName = "id")
        private ProjectEntity1 projectEntity;
}
