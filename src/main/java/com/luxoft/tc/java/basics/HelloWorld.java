package com.luxoft.tc.java.basics;

public class HelloWorld {

    private static int f = 150;

    public static boolean is7inArray(int[] ints) {
        for (int i : ints)
            if (i == 7)
                return true;
        return false;
    }

    public static Interf1 m2() {
        return () -> String.format("Мама мыла раму %d раз!", f);
    }
}
