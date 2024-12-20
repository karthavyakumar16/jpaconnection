package com.neoteric.jpaconnection.jpaconnection.jpapractice;

import java.util.List;

public class IndexPositionTest {
    public static void main(String[] args) {


        List<EmployeeEntity> employees = IndexPositionService.projectAlloctionEmployeesParameterized(7);
        employees.forEach(employee -> System.out.println("Employee Name: " + employee.getName()));

       // List<EmployeeEntity> employees1 = IndexPositionService.projectAlloctionEmployeesParameterizedByPosition(8);
       // employees1.forEach(employee -> System.out.println("Employee Name: " + employee.getName()));


//        List<EmployeeEntity> employeeSalary = IndexPositionService.getEmployeesLessSalary(26000);
//        employeeSalary.forEach(emp ->{
//            System.out.println("  " + emp.getName() + "  " + emp.getSalary());
//        });

    }
}

