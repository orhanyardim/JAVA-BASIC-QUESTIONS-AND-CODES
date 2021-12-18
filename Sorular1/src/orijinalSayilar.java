import java.util.Scanner;

public class orijinalSayilar {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Lütfen dört basamaklı bir sayı giriniz: ");
        int number=scr.nextInt();
        if((number>999)&&(number<10000))
        {
            int first=number/100;
            int last=number%100;
            int total=first+last;
            if(total*total==number)
                System.out.println(number+" sayısı Orijinal bir sayıdır.");
            else System.out.println(number+" sayısı Orijinal bir sayı değildir.");

    }
        else main(args);
}}
