package com.neoteric.jpaconnection.jpaconnection.singletondesign.singleton;

public class SingleTonModel {

  private static final SingleTonModel singletonmodel=new SingleTonModel();
    public int number=0;

    private SingleTonModel() {

    }


    public static SingleTonModel getOrder(){
        return singletonmodel;
    }
}
