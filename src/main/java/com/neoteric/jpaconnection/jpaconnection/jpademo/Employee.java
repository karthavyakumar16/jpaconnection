package com.neoteric.jpaconnection.jpaconnection.jpademo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="employee",schema="sonar")

public class Employee {

public  Employee(){

}
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
    @JoinColumn(name = "pid",referencedColumnName = "id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "mid", referencedColumnName = "id")
    private Employee manager;

    @OneToMany(mappedBy = "manager")
    private List<Employee> employeeList;

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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
