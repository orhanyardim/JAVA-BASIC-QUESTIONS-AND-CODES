package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        String path="C:\\Users\\kerim\\Desktop\\Dersler\\İleri Java Programlama\\Java Soru ve Kodları\\TelephoneBook\\book.txt";
        Scanner scr=new Scanner(System.in);
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        dosya book=new dosya(path,true);

        while(true){
            System.out.println("################################################");
            System.out.println("PRESS '1' TO OPEN THE NUMBERBOOK");
            System.out.println("PRESS '2' TO ADD NEW NUMBER");
            System.out.println("PRESS '3' TO SEARCH NUMBER");
            System.out.println("PRESS '4' TO UPDATE NUMBER");
            System.out.println("PRESS '0' TO EXIT");
            System.out.println("################################################");
            int select=scr.nextInt();
            switch (select){
                case 1:{

                    System.out.println("Numbers");
                    ArrayList<String> lines= book.readFile();
                    for(int i=0;i< lines.size();i+=2){
                        System.out.println(lines.get(i)+" --> "+lines.get(i+1));
                    }

                    break;
                }

                case 2:{
                    System.out.println("Please enter the Number:");
                    String number=input.readLine();
                    System.out.println("Please enter the name:");
                    String name= input.readLine();
                    System.out.println("Number is saving...");
                    Thread.sleep(3000);
                    book.writeFile(name);
                    book.writeFile(number);
                    System.out.println("It's Done.");
                    break;
                }

                case 3:{
                    System.out.println("Please enter the search name");
                    String searchName= input.readLine();
                    System.out.println("Number is Searching...");
                    Thread.sleep(3000);
                    searchName=book.searchNumber(searchName);
                    System.out.println("Number:"+searchName);

                    break;
                }
                case 4:{
                    System.out.println("Please enter the name of you want to change");
                    book.readFile();
                    String searchName=input.readLine();
                    book.update(searchName);
                    break;
                }
                case 0:
                    System.exit(1);
                    break;
            }

        }
    }
}
