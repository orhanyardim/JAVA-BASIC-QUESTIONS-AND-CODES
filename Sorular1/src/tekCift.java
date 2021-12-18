import java.util.Scanner;

public class tekCift {
    public static void main(String[] args) {
        Scanner scr =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int number= scr.nextInt();
        if(number%2==1) System.out.println("Girilen sayı tektir");
        else System.out.println("Girilen sayı çifttir");
    }
}
