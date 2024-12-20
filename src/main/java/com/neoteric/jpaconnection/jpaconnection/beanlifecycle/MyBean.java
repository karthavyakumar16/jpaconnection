package com.neoteric.jpaconnection.jpaconnection.beanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBean {

    private final DependencyBean dependencyBean;
private String additionalProperty;


    public MyBean(DependencyBean dependencyBean) {
        this.dependencyBean = dependencyBean;
    }

    public void setAdditionalProperty(String additionalProperty) {
        this.additionalProperty = additionalProperty;
        System.out.println("Setter: additionalProperty is set to " + additionalProperty);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("2. @PostConstruct: Initialization logic.");
    }

    public void customInit() {
        System.out.println("3. customInit(): Custom initialization logic.");
    }

    public void performTask() {
        System.out.println("4. Bean is in use: Performing tasks with DependencyBean.");
        dependencyBean.excute();
        System.out.println("Using additional property: " + additionalProperty);
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("5. @PreDestroy: Pre-destroy logic.");
    }

    public void customDestroy() {
        System.out.println("6. customDestroy(): Custom destroy logic.");
    }

}

