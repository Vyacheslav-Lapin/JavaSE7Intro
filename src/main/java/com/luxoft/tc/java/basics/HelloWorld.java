package com.luxoft.tc.java.basics;

public class HelloWorld {
    static public void main(String... strings) {
        System.out.println(new MessageGen().getMessage());
        int i = 0;
        int j = ++i;
        System.out.println(j);

        //...

        System.out.println((i == 0) ? "ноль" : "не ноль");

        Integer i1 = 5;
        int i2 = i1;
        m1(i1);
    }

    public static void m1(int i) {
        System.out.println(i);
    }
}
