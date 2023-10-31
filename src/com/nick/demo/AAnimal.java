package com.nick.demo;

public abstract class AAnimal {

private String name;
private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void test() {
        System.out.println("HELLO IT WORKS");
    }

    public abstract void testAbstract();

    // TODO - When to use NORMAL vs ABSTRACT methods?

}
