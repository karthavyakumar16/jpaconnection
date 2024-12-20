package com.neoteric.jpaconnection.jpaconnection.jpaonetomanyinserts;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OneToManyJPATest {
    public static void main(String[] args) {
        List<Project> projectList=new ArrayList<>();

        Project avoto = new Project();
        avoto.setName("avoto");
        avoto.setStartDate(new Date());
        avoto.setEndDate(new Date());

        Project mitra = new Project();
        mitra.setName("mitra");
        mitra.setStartDate(new Date());
        mitra.setEndDate(new Date());

        Employee susheel =new Employee();
        susheel.setDept("cse");
        susheel.setSalary(25000);
        susheel.setName("susheel");

        Employee arun =new Employee();
        arun.setDept("cse");
        arun.setSalary(35000);
        arun.setName("arun");


        avoto.getEmployees().add(susheel);
        avoto.getEmployees().add(arun);

        Employee chandu =new Employee();
        chandu.setDept("ece");
        chandu.setSalary(45000);
        chandu.setName("chandu");

        Employee suku =new Employee();
        suku.setDept("cse");
        suku.setSalary(55000);
        suku.setName("suku");
        mitra.getEmployees().add(chandu);
        mitra.getEmployees().add(suku);


        projectList.add(avoto);
        projectList.add(mitra);

        EmployeService service = new EmployeService();
       // service.savejpa();

    }
}
