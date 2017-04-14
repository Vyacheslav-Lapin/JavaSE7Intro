package com.luxoft.tc.java.basics;

public class HelloWorld {
    static public void main(String... strings) {
        if (m1(1) && m1(0)) {
            System.out.println("пришли!");
        } else
        System.out.println("не пришли!");
    }

    public static boolean m1(int i) {
        System.out.println(i);
        return i == 0;
    }
}
