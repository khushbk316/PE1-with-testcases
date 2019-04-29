package com.Stackroute.pe1;

public class Series {
    String str="";
    int i,j;
    public String print(int num) {
        for(i=1;i<=num;i++)
        {
            for(j=i;j>=1;j--)
                str=str+i;
        }



        return str;

    }



}
