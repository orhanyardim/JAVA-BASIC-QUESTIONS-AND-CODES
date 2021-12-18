package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("a=");
        int a=scr.nextInt();
        System.out.print("b=");
        int b=scr.nextInt();

        if(pozitifBolen(a)==pozitifBolen(b))
            System.out.println(a+" ile "+b+" dost sayılardır");
        else
            System.out.println(a+" ile "+b+" dost sayı değildir");


    }

    static int pozitifBolen(int sayi) {
        int sum=0;
        for(int i=2;i<=sayi;i++){
            if(sayi%i==0)
                sum=sum+i;
        }
        return sum;
    }
}


