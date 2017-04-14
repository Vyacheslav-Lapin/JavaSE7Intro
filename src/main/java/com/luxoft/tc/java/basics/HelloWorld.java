package com.luxoft.tc.java.basics;

public class HelloWorld {

    public static boolean is7inArray(int[] ints) {
        for (int i: ints)
            if (i == 7)
                return true;
        return false;
    }
}
