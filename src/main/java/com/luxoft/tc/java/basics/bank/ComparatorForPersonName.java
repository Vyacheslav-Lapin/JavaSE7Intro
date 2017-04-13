package com.luxoft.tc.java.basics.bank;

import java.util.Comparator;

public class ComparatorForPersonName implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getPerson().getName().compareTo(
                o2.getPerson().getName()
        );
    }
}
