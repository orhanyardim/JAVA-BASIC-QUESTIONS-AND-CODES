package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int a=scr.nextInt();
        System.out.println("Lütfen bir sayı giriniz");
        int b=scr.nextInt();
        if(a>b){
            int division=a/b;
            System.out.println("Bölüm="+division);
            System.out.println("Kalan="+(a-division*b));
        }
        else{
            int division=b/a;
            System.out.println("Bölüm="+division);
            System.out.println("Kalan="+(b-division*a));
        }

    }
}
