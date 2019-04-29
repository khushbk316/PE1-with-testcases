package com.Stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TomJerryTest extends TomJerry {

    TomJerry tj=new TomJerry();
    @Test
    public void check() {


        assertEquals("jerry",tj.check(25));

    }

}
