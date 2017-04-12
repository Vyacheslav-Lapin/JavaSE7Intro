package com.luxoft.tc.java.basics;

public class HelloWorld {
    static public void main(String... strings) {
        System.out.println(new MessageGen().getMessage());
        int i = 0;
        int j = ++i;
        System.out.println(j);
    }
}
