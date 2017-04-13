package com.luxoft.tc.java.basics.bank;

public class D extends B implements C, E {
    @Override
    public void m3(int i) {
        E.super.m3(i);
    }


//    @Override
//    public void m3(int i) {
//        System.out.printf(
//                "from %s: меня вызвали со значением %d!!!",
//                getClass().getSimpleName(),
//                i
//        );
//    }
}
