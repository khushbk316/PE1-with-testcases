package com.Stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class vowelConsonentTest {
    vowelConsonent vc=new vowelConsonent();

    @Test
    public void vowcon() {
        assertEquals("consonant",vc.vowcon("ohi dear"));
    }
}