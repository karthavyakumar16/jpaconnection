package com.neoteric.jpaconnection.jpaconnection.beanlifecycle;

import org.springframework.stereotype.Component;

@Component
public class DependencyBean {


    public void excute(){
        System.out.println("frist bean");
    }
}
