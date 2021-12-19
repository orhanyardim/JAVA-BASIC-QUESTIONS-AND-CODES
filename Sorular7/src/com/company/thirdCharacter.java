package com.company;

import java.util.Scanner;

public class thirdCharacter {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String myString=scr.nextLine();

        for(int i=0;;i=i+3){
            if(i>=myString.length())
                break;
            System.out.print(myString.charAt(i));
        }
    }
}
