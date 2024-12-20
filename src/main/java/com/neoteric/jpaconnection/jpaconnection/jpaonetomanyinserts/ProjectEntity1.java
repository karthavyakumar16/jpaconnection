package com.neoteric.jpaconnection.jpaconnection.jpaonetomanyinserts;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="project",schema="sonar")
@Data
public class ProjectEntity1 {
    public ProjectEntity1(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public List<EmployeeEntity1> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity1> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }

    @Id
    @Column(name="id")
    private int id;
    @Column(name="pname")
    private String pname;

    @Column(name="startdate")
    private Date startdate;

    @Column(name="enddate")
    private Date enddate;
    @OneToMany(mappedBy = "projectEntity",cascade = CascadeType.ALL)
    private List<EmployeeEntity1> employeeEntityList = new ArrayList<>();
}
