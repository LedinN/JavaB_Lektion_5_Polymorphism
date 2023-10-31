package com.nick.demo;

public interface IAnimal {

    void test();

    public default void testDefault(){
        System.out.println("TESTING DEFAULT");
    }

}
