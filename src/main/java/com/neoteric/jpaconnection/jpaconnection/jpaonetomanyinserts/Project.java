package com.neoteric.jpaconnection.jpaconnection.jpaonetomanyinserts;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;



public class Project {

    private int id;

    private String name;

    private Date startDate;

    private Date endDate;

    private List<Employee> employees;

    public Project() {

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }



}
