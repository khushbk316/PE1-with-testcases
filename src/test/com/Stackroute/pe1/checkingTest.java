package com.Stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class checkingTest
{
   checking chk=new checking();
    @Test
    public void checking() {


        assertEquals("small",chk.checkup('a'));

    }



}