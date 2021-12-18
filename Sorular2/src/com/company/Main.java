package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scr=new Scanner(System.in);
        System.out.print("Lütfen başlangıç değerini giriniz\n a=");
        int a=scr.nextInt();
        System.out.print("Lütfen bitiş değerini giriniz\n b=");
        int b=scr.nextInt();
        if(b<a) {
            int tut=b;
            b=a;
            a=tut;


        }
        else if(a==b) {
            System.out.println("Başlangıç ve Bitiş değerleri aynı olamaz");
            System.exit(1);
        }

        if((b-a)%2==0){
            int toplam=0;
            for(;a<=b;a=a+2) {
                System.out.println(a);
                System.out.println("+");
                toplam=toplam+a;
                if(a==b) System.out.println("="+toplam);
            }
        }
        else {
            int toplam=0;
            for(;a<=b;a++){
                System.out.println(a);
            System.out.println("+");
            toplam=toplam+a;
            if(a==b) System.out.println("="+toplam);}
        }
        }

    }




