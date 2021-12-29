package com.company;

import java.io.*;
import java.util.Locale;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedReader bufrdr=new BufferedReader(new InputStreamReader(System.in));
        dosya yenidosya=new dosya("yeni.txt",true);


        System.out.println("-------------HOŞGELDİNİZ-------------");

        String kelime= yenidosya.kelimecek(yenidosya.oku());
        while(kelime==null)
            kelime= yenidosya.kelimecek(yenidosya.oku());

        //String temp=kelime;
        char kelimearray[]=kelime.toCharArray();
        //System.out.println(kelime);
        int hak=5;
        int puan=0;
        long sure=20;
        for(int i=0;i<kelime.length();i++){
            kelimearray[i]='_';
        }

        System.out.println("Oyunu başlatamak için(y)");
        System.out.println("Kelime Eklemek için(a)");
        System.out.println(kelime);
        char check=bufrdr.readLine().charAt(0);
        if(check=='y'){
            int i=0;
            while(true){

                if(hak==0 | sure<=0)
                    break;
                //INFO SCREEN
                System.out.println(kelimearray);
                System.out.println((i+1)+". Harf");
                System.out.println("Süre:"+sure);
                System.out.println("HAK:"+hak);
                System.out.println("PUAN:"+puan);


                //TIME SETTINGS
                long then=System.currentTimeMillis();
                char harf=bufrdr.readLine().charAt(0);      //READING CHARACTER
                long now=System.currentTimeMillis();

                then=then/(long)1000;
                now=now/(long)1000;
                sure=sure-(now-then);

                //PRE PROCESSING
                String temp2=String.valueOf(harf);
                temp2=temp2.toLowerCase(Locale.ROOT);
                harf=temp2.charAt(0);

                System.out.println("##################################################################");
                if(sure<=0)
                    break;
                if(kelime.charAt(i)==harf){

                    if(i==kelime.length()-1){
                        System.out.println("Doğru Kelime Bravo");
                        puan+=10;
                        break;
                    }
                    kelimearray[i]=harf;
                    sure=20;
                    i++;
                }
                else{
                    hak--;
                    System.out.println("Yanlış Cevap\nHAK:"+hak);

                }
            }
        }
        else if(check=='a'){
            System.out.println("Lütfen eklemek istediğiniz kelimeyi giriniz");
            yenidosya.yaz(bufrdr.readLine());
        }
        if(sure<=0)
            System.out.println("Süre Bitti");
        if(hak==0)
            System.out.println("Hak Bitti");
    }
}
