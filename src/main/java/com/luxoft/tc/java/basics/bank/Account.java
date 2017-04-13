package com.luxoft.tc.java.basics.bank;

import com.luxoft.tc.java.basics.Person;
import lombok.*;

@AllArgsConstructor
@Data
public class Account {

    private final Person person;
    private int bill;
    private int overdraft;

    public static void main(String[] args) {

        Account account = new Account(
                new Person("John Smith", 55),
                500,
                100);
    }
}
