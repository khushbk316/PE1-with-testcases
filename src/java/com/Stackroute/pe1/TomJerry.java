package com.Stackroute.pe1;

public class TomJerry {

    String str;

    public String check(int num) {

        if (num > 20 && num < 30) {
            if (num % 2 != 0)
                str = "tom";
            else
                str = "jerry";
        }
        return str;

    }
}
