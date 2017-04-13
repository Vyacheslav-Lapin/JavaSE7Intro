package com.luxoft.tc.java.basics.oop;

public class A {
    public void m() {
        System.out.printf(
                "from %s: меня вызвали!!!",
                getClass().getSimpleName()
        );
    }
}
