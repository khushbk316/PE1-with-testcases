package com.Stackroute.pe1;

public class vowelConsonent {

    int i;
    char c;
    String str1;

    public String vowcon(String str) {


        for (i = 0; i < str.length(); i++) {

            c = str.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                str1 = "vowels";
            }
            else {
                str1 = "consonant";
            }
        }

        return str1;
    }
}




