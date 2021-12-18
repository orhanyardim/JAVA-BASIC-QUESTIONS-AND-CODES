import java.util.Scanner;

public class reverse {
    static int sayac=0;
    static String temp="";
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String word=scr.nextLine();
        sayac=word.length();
        System.out.println(reverse(word));
    }

    static String reverse(String a){

       if(sayac==0){
           return "";
       }
       else {
           sayac--;
           return temp+a.charAt(sayac)+reverse(a);
       }

    }
}
