package com.neoteric.jpaconnection.jpaconnection.jpaonetomanyinserts;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;
import java.util.List;

public class EmployeService {

    public void savejpa(Project project){

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        ProjectEntity1 projectEntity=new ProjectEntity1();
        projectEntity.setPname(project.getName());
        projectEntity.setStartdate(project.getStartDate());
        projectEntity.setEnddate(project.getEndDate());

     List<EmployeeEntity1> employeeEntityList = new ArrayList<>();

     for(int i=0; i<project.getEmployees().size();i++){
         Employee emp = project.getEmployees().get(i);
         EmployeeEntity1 employee = new EmployeeEntity1();
         employee.setName(emp.getName());
         employee.setDept(emp.getDept());
         employee.setSalary(emp.getSalary());
         employee.setProjectEntity(projectEntity);
         employeeEntityList.add(employee);

     }
     projectEntity.setEmployeeEntityList(employeeEntityList);
     entityManager.persist(projectEntity);

     entityManager.getTransaction().commit();
    }
}
