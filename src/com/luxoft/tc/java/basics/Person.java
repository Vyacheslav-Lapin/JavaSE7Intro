package com.luxoft.tc.java.basics;

public class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "com.luxoft.tc.java.basics.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
