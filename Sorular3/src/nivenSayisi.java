import java.util.Scanner;

public class nivenSayisi {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("a=");
        int a=scr.nextInt();
        System.out.print("b=");
        int b=scr.nextInt();

        if(pozitifBolen(a)==pozitifBolen(b)&harshad(a)&harshad(b))
            System.out.println(a+" ile "+b+" dost niven sayılardır");
        else
            System.out.println(a+" ile "+b+" dost niven sayı değildir");


    }

    static int pozitifBolen(int sayi) {           //----------POZİTİF BÖLEN KONTROL EDİLİR
        int sum=0;
        for(int i=2;i<=sayi;i++){
            if(sayi%i==0)
                sum=sum+i;
        }
        return sum;
    }

    static boolean harshad(int sayi){             //--------------HARSHAD KONTROLU YAPILIR

            int a=0;
            int toplam=0;
            if(sayi<10) {
                a = sayi % 10;
                return harshadControl(a,a);
            }
            else if(sayi<100){
                a=sayi%10;
                toplam=a;
                a=sayi-a;
                a=a/10;
                toplam=toplam+a;
                return harshadControl(sayi,toplam);

            }
            else{
                a=sayi%10;
                toplam=a;
                a=sayi-a;
                a=(a%100)/10;
                toplam=toplam+a;
                a=sayi-a;
                a=a/100;
                toplam=toplam+a;
                return harshadControl(sayi,toplam);

            }
        }
    static boolean harshadControl(int number,int toplam){
        if(number%toplam==0)
            return true;
        else
            return false;
    }
}



