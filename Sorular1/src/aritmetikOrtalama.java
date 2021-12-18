import java.util.Scanner;

public class aritmetikOrtalama {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("İlk Sayı:");
        double firstNumber=scr.nextDouble();
        System.out.println("İkinci Sayı:");
        double secondNumber=scr.nextDouble();
        System.out.println("Üçüncü Sayı:");
        double thirdNumber=scr.nextDouble();

        System.out.println("Average="+((firstNumber+secondNumber+thirdNumber)/3));
    }
}
