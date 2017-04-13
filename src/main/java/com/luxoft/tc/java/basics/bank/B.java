package com.luxoft.tc.java.basics.bank;

public class B extends A {
    public void m2() {
        System.out.printf(
                "from %s: меня вызвали!!!",
                getClass().getSimpleName()
        );
    }
}
