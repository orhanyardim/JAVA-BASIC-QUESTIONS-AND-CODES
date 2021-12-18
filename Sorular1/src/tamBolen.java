import java.util.Scanner;

public class tamBolen {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("İlk Sayı:");
        int firstNumber=scr.nextInt();
        System.out.print("İkinci Sayı:");
        int secondNumber=scr.nextInt();
        if(firstNumber>secondNumber) {
            if(firstNumber%secondNumber==0)
                System.out.println(secondNumber+" sayısı "+firstNumber+" sayısının tam bölenidir.");
            else System.out.println(secondNumber+" sayısı "+firstNumber+" sayısının tam böleni değildir.");
        }
        else {
            if(secondNumber%firstNumber==0)
                System.out.println(firstNumber+" sayı "+secondNumber+" sayısının tam bölenidir.");
            else System.out.println(firstNumber+" sayı "+secondNumber+" sayısının tam böleni değildir.");
        }
    }
}
