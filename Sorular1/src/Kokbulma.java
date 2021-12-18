import java.util.Scanner;

public class Kokbulma {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("X^2 nin katsayısını girin");
        double a=scr.nextDouble();
        System.out.println("X in katsayısını girin");
        double b=scr.nextDouble();
        System.out.println("Sabit sayıyı giriniz");
        double c=scr.nextDouble();
        double delta=b*b-4*a*c;

        double x1=(-b-Math.sqrt(delta))/2*a;
        double x2=(-b+Math.sqrt(delta))/2*a;
        System.out.println("X1="+x1);
        System.out.println("X2="+x2);


    }
}
