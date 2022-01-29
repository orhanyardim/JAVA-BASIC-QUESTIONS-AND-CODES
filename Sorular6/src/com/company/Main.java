package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        student ogrenci=new student("Kerim","111111111");
        Scanner scr=new Scanner(System.in);
        student harun=new student("harun","204410022");


        //ÖĞRENCİ ADI DÖNDÜRME

       /* System.out.println(ogrenci.getName());

        //ÖĞRENCİ İÇİN YENİ AD TANIMLAMA
        ogrenci.setName("Furkan");

        //ÖĞRENCİ NO DÖNDÜRME
        System.out.println(ogrenci.getID());

        //AKTS ARTIRMA
        ogrenci.setCredits(ogrenci.getCredits()+1);
        System.out.println("Kredi:"+ogrenci.getCredits());

        //ÖĞRENCİ ADI VE ID YAZDIRMA
        System.out.println(ogrenci.getName()+"\n"+ogrenci.getID());

        ogrenci.setCredits(245);
        System.out.println("Kredi:"+ogrenci.getCredits());*/
        //---------------------------------------------------------------------------------------------------

        meeting toplanti=new meeting("13:20","Okul","Sınavlar");
        toplanti.printDetails();







    }
}
