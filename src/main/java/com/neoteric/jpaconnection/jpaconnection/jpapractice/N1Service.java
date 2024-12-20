package com.neoteric.jpaconnection.jpaconnection.jpapractice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class N1Service {
    public List<ProjectEntity> nplusone(){
        EntityManagerFactory entityManagerFactory=
                Persistence.createEntityManagerFactory("Jpapractice");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Query query=entityManager.createQuery("select distinct(p)from ProjectEntity p join fetch p.employeeEntityList",
                ProjectEntity.class);
        List<ProjectEntity> projectEntities=query.getResultList();
        entityManager.getTransaction().commit();
        return projectEntities;


    }

    public static void main(String[] args) {
        N1Service n1Service=new N1Service();
        List<ProjectEntity> projectList =  n1Service.nplusone();
        for(int i =0 ; i<projectList.size(); i++ ) {
            System.out.println(" Project  " + projectList.get(i));
            projectList.get(i).getEmployeeEntityList().forEach(emp -> {
                System.out.println("  emp " + emp);
            });

        }
        System.out.println(projectList);
    }
}
