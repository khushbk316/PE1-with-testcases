package com.Stackroute.pe1;

public class checkingUppercaseLowercaseOrNumber {

    char character;
    String str;
    public String checkingCharacter(char ch) {
        if (character >= 'a' && character <= 'z')
            str = "small";
        else if (character >= 'A' && character <= 'Z')
            str = "capital";
        else if (character >= '0' && character <= '9')
            str = "number";
        else str = "special";

        System.out.printf(str);

        return str;

    }

}
