package com.Stackroute.pe1;

public class checking {

    char ch;
    String str;
    public String checkup (char ch) {
        if (ch >= 'a' && ch <= 'z')
            str = "small";
        else if (ch >= 'A' && ch <= 'Z')
            str = "capital";
        else if (ch >= '0' && ch <= '9')
            str = "number";
        else str = "special";

        System.out.printf(str);

        return str;

    }

}
