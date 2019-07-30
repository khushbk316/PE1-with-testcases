package com.Stackroute.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class checkingUppercaseLowercaseOrNumberTest
{
   checkingUppercaseLowercaseOrNumber object=new checkingUppercaseLowercaseOrNumber();
    @Test
    public void lowerCaseShouldReturnsmall() {

        assertEquals("small",object.checkingCharacter('a'));

    }
    @Test
    public void upperCaseShouldReturncapital() {

        assertNotEquals("capital",object.checkingCharacter('a'));

    }
    @Test
    public void specialCharacterShouldReturnspecial() {

        assertEquals("special",object.checkingCharacter('*'));

    }


}