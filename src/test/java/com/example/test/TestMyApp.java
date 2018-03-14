package com.example.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.example.MyApp;

public class TestMyApp {

    @Test
    public void testAdd() {
        MyApp obj = new MyApp();
        assertEquals(2, obj.add(1,1));
        assertEquals(4, obj.add(2,2));
    }

}