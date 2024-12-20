package com.neoteric.jpaconnection.jpaconnection.singletondesign.singleton;

public class SingleTonTest {

    public static void main(String[] args) {

        SingleTonModel singleTonModel=SingleTonModel.getOrder();
        System.out.println(singleTonModel.number);
        singleTonModel.number=10;
        System.out.println(singleTonModel.number);

        SingleTonModel singleTonModel1=SingleTonModel.getOrder();
        System.out.println(singleTonModel1.number);
        singleTonModel1.number=20;
        System.out.println(singleTonModel1.number);

        SingleTonModel singleTonModel2=SingleTonModel.getOrder();
        System.out.println(singleTonModel2.number);
        singleTonModel2.number=30;
        System.out.println(singleTonModel2.number);
    }
}
