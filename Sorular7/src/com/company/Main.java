package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz\n");
        String sentence=scr.nextLine();
        String words[]=sentence.split(" ");

        //trim ,lowercase,nokta ve virgülleri sil.STRING ILE ISLEM YAPACAKSAN BU ON ISLEMLERI YAP

        int count=0; int index=0;
        for(int i=0;i< words.length;i++){
            if(count<words[i].length()){
                index=i;
                count=words[i].length();
            }
        }
        System.out.println("En uzun kelime:"+words[index] +"\nHarf Sayısı:"+count);
    }
}
