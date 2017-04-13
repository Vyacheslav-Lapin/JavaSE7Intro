package com.luxoft.tc.java.basics.bank;

public class BankApplication {

    private Bank bank;

    public BankApplication() {
//        this(new Bank("Сбербанк"));
    }

    public BankApplication(Bank bank) {
        this.bank = bank;
        System.out.println(counter);
    }

    {
        System.out.println(counter);
        bank = new Bank("Сбербанк");
    }

    private static int counter;

    static {
        counter = 5;
    }

    static final int i = 52;

    public static void main(String[] args) {

        System.out.println(i);

        BankApplication bankApplication = new BankApplication();
        new BankApplication(new Bank("Альфабанк"));
    }


}
