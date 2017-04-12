package com.luxoft.tc.java.basics;

public class MessageGen {
    public String getMessage() {
        return "Hello, World!!!";
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = person1;
        System.out.println(person1.getAge()); //0
        System.out.println(person2.getAge()); //0
        person1.setAge(50);
        System.out.println(person1.getAge());//50
        System.out.println(person2.getAge());//50

        System.out.println();

        int i = 5;
        int j = i;
        System.out.printf("i = %d; j = %d%n", i, j);
        i = 55;
        System.out.printf("i = %d; j = %d%n", i, j);

    }
}
