import java.util.Scanner;

public class enbuyukAsal {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.print("Sayı=");
        int sayi=scr.nextInt();



        if(sayi<2)
            System.out.print("2'den küçük bir asal sayı yoktur");
        else if(sayi==3)
            System.out.print("2");
        for(int i=sayi-1;i<sayi;i--){

            for (int j = 2; j < i; j++){

                if (i % j == 0)
                    break;

                else if(j==i-1){
                    System.out.print(i);
                    sayi=0;
                }
            }
        }
    }
}
