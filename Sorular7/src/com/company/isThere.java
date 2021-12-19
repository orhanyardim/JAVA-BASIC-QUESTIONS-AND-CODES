package com.company;

import java.util.Locale;
import java.util.Scanner;

public class isThere {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String myString= scr.nextLine();
        myString=myString.toLowerCase(Locale.ROOT);

        int count=0;
        int len=myString.length();
        for(int i=0;;i++){
            if(i+2==len+1)
                break;
            if(myString.substring(i,i+2).equals("ve"))
                count++;
        }
        System.out.println("Toplam "+count+" adet 've' bulunmaktadır");

    }
}
