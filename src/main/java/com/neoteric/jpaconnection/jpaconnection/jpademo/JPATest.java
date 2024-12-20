package com.neoteric.jpaconnection.jpaconnection.jpademo;

import java.util.List;
import java.util.Map;

public class JPATest {
    public static void main(String[] args) {


        JPAService jpaservice = new JPAService();
        Map<Integer, List<Employee>> projectEmployeeMap = jpaservice.getAllocationEmployeesJpa();

        for (Map.Entry<Integer, List<Employee>> entry : projectEmployeeMap.entrySet()) {
            System.out.println("Project ID: " + entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.println("Employee Name: " + employee.getName());
            }
        }

    }
}