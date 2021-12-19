package com.company;

import java.util.Locale;
import java.util.Scanner;

public class sesliHarf {
    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String myString= scr.nextLine();
        char sesliharfler[]={'a','e','ı','i','u','ü','o','ö'};
        myString=myString.toLowerCase(Locale.ROOT);

        int count=0;
        for(int i=0;i<myString.length();i++){
            for(int j=0;j<sesliharfler.length;j++){
                if(myString.charAt(i)==sesliharfler[j])
                    count++;
            }
        }
        System.out.println("Toplam "+count+" adet sesli harf bulunmaktadır");

    }
}
