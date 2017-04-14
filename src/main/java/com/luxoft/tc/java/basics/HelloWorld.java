package com.luxoft.tc.java.basics;

public class HelloWorld {

    private static int f = 150;

    public static boolean is7inArray(int[] ints) {
        for (int i : ints)
            if (i == 7)
                return true;
        return false;
    }

    public static class Inner1 implements Interf1 {
        @Override
        public String m1() {
            return String.format(
                    "Мама мыла раму %d раз!",
                    f
            );
        }
    }

    public static Interf1 m2() {
        return new Inner1();
    }
}
