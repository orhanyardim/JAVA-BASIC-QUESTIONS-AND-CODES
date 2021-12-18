import java.util.Scanner;

public class AkrepYelkovanAci {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Saat=");
        int hour=scr.nextInt();
        System.out.print("Dakika=");
        int minute=scr.nextInt();
        if(hour>12) hour=hour%12;
        double acı=(11*minute-60*hour)/2;
        if(acı<0)
            acı=-acı;
        if(acı>180) acı=360-acı;
        System.out.println("Açı= "+acı);

    }
}
