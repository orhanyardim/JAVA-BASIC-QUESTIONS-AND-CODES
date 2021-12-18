package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Speed:");
        double firstSpeed=scr.nextDouble();
        System.out.print("Time:");
        int time=scr.nextInt();

        for(int i=0;i<time;i++){
            firstSpeed=firstSpeed+firstSpeed/5;
            System.out.println("Second:"+(i+1)+" Speed:"+firstSpeed);

        }
    }

}
