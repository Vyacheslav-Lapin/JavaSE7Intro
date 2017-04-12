package com.luxoft.tc.java.basics.bank;

import com.luxoft.tc.java.basics.Person;

public class Account {

    private Person person;

    private int bill;

    private int overdraft;

    public Account(Person person, int bill, int overdraft) {
        this.person = person;
        this.bill = bill;
        this.overdraft = overdraft;
    }
}
