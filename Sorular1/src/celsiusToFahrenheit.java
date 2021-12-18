import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("C=");
        double celcius=scr.nextDouble();
        if(celcius>=-273)
        System.out.println((celcius)+"C"+"="+(celcius*1.8+32)+"F");
        else System.out.println("C değeri -273'den küçük olamaz.");
    }
}
