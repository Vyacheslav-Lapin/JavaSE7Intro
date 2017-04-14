package com.luxoft.tc.java.basics;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class HelloWorldTest {

    @Test
    public void m2() throws Exception {
        assertThat(HelloWorld.m2().m1(),
                is("Мама мыла раму 150 раз!"));
    }

    @Test
    public void is7inArrayWorksCorrectly() {
        assertFalse(HelloWorld.is7inArray(new int[]{1, 2, 3}));
        assertTrue(HelloWorld.is7inArray(new int[]{1, 7, 3}));
        assertTrue(HelloWorld.is7inArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}