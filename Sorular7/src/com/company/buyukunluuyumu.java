package com.company;

import java.util.Locale;
import java.util.Scanner;

public class buyukunluuyumu {
    static char incesesli[]={'e','i','ö','ü'};

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String myString=scr.nextLine();
        myString=myString.toLowerCase(Locale.ROOT);

        char kalinsesli[]={'a','ı','o','u'};
        boolean kalinmi=false;

        for(int i=0;i<myString.length();i++){
            for(int j=0;j<kalinsesli.length;j++){//kalinsesli ile incesesli nin length i aynı olduğu için fark etmez.
                if(incemi(myString)){
                    if(myString.charAt(i)==kalinsesli[j]){
                        System.out.println(myString+" Büyük ünlü uyumuna uymaz");
                        kalinmi=true;
                        break;
                    }
                }

            }
            if(kalinmi)
                break;
            else if(i==myString.length()-1)
                System.out.println(myString+" Büyük ünlü uyumuna uyar");
        }

    }

    static boolean incemi(String str){
        int j=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==incesesli[j])
                return true;
            else if(i==str.length()-1 & (j+1)!=incesesli.length){
                i=0;
                j++;
            }
        }
        return false;
    }
}
