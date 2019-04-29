package com.Stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeriesTest {
    Series ser=new Series();
    @Test
    public void print() {


        assertEquals("122",ser.print(2));

    }



}
