package com.luxoft.tc.java.basics.bank;

public class A {
    public void m() {
        System.out.printf(
                "from %s: меня вызвали!!!",
                getClass().getSimpleName()
        );
    }
}
