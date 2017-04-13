package com.luxoft.tc.java.basics.bank;

public class BankApplication {
    public static void main(String[] args) {
//        Account account = new Account(
//                new Person("John Smith", 35),
//                500,
//                1000
//        );
//
//        System.out.println(account);

        A a = new A();
        A a1 = new B();
//        B b = (B) new F(); // not works
        D a3 = new D();

        C c = new D();
        c.m3(1);

        b.m2();
        a3.m3(1);
    }

    
}
