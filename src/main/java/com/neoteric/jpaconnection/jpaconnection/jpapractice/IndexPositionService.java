package com.neoteric.jpaconnection.jpaconnection.jpapractice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class IndexPositionService {

    public static List<EmployeeEntity> projectAlloctionEmployeesParameterizedByPosition(int pid) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JpaDemo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();


        String jpql = "SELECT e FROM EmployeeEntity e WHERE e.project.id = ?1"; //  positional parameter ?1 for the project ID

        Query query = entityManager.createQuery(jpql, EmployeeEntity.class);
        query.setParameter(1, pid);


        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }

    public static List<EmployeeEntity> projectAlloctionEmployeesParameterized(int pid) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jpapractice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        String jpql = "SELECT e FROM EmployeeEntity e WHERE e.project.id = :pid";  //named parameter pid

        Query query = entityManager.createQuery(jpql, EmployeeEntity.class);

        query.setParameter("pid", pid);

        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }

    public static List<EmployeeEntity> getEmployeesLessSalary(double employeeSalary) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jpapractice");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        // JPQL query with the correct parameter name
        String jpql = "select e from EmployeeEntity e where e.salary < :empSalary";

        // Create the query and set the correct parameter name
        Query query = entityManager.createQuery(jpql, EmployeeEntity.class);
        query.setParameter("empSalary", employeeSalary); // Parameter name should be "empSalary"

        // Get the results
        List<EmployeeEntity> employees = query.getResultList();

        entityManager.getTransaction().commit();
        entityManager.close();

        return employees;
    }
}
