package com.neoteric.jpaconnection.jpaconnection.beanlifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean myBean=context.getBean(MyBean.class);
        myBean.setAdditionalProperty("AdditionalProperty");
myBean.preDestroy();
myBean.customDestroy();
myBean.customInit();
myBean.performTask();
myBean.postConstruct();
context.close();

    }
}
