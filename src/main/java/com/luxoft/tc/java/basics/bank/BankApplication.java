package com.luxoft.tc.java.basics.bank;

import com.luxoft.tc.java.basics.Person;

public class BankApplication {
    public static void main(String[] args) {
        Account account = new Account(
                new Person("John Smith", 35),
                500,
                1000
        );

        System.out.println(account);
    }

    
}
