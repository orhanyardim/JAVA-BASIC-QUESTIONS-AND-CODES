import java.util.Scanner;

public class secondConverter {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Lütfen saniye değerini giriniz");
        int second=scr.nextInt();
        int hh,mm,ss;
        mm=second/60;
        hh=mm/60;
        ss=second-mm*60;
        mm=mm-hh*60;

        System.out.println(hh+":"+mm+":"+ss);
    }
}
