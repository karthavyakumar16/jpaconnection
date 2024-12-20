package com.neoteric.jpaconnection.jpaconnection.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.neoteric.jpaconnection.jpaconnection.beanlifecycle")
public class AppConfig {
    @Bean(initMethod = "customInit",destroyMethod = "customDestroy")
    public MyBean myBean(DependencyBean dependencyBean){
        return new MyBean(dependencyBean);
    }
    @Bean
    public DependencyBean dependencyBean(){
        return new DependencyBean();
    }
}
