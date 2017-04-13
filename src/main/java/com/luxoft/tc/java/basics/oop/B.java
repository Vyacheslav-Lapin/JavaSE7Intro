package com.luxoft.tc.java.basics.oop;

public class B extends A {
    public void m2() {
        System.out.printf(
                "from %s: меня вызвали!!!",
                getClass().getSimpleName()
        );
    }
}
