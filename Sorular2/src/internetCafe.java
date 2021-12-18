import java.util.Scanner;

public class internetCafe {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Saat:");
        int saat=scr.nextInt();
        System.out.print("Çay:");
        int cay=scr.nextInt();
        System.out.print("Kola:");
        int kola=scr.nextInt();

       System.out.print("Ödenecek Fiyat:"+(2*(kola-bedava(kola))+caySayisi(cay,saat)+saatFiyat(saat)*saat+" TL"));



    }
    static int bedava(int kolasayisi){
        int bedava;
        bedava=kolasayisi/3;

        return bedava;
    }
    static int caySayisi(int cay,int kacsaat){
        if(cay>=kacsaat)
        cay=cay-(kacsaat-3);

        return cay;
    }
    static int saatFiyat(int saat){
        if(saat==1)
            saat=5;
        else if((saat>1)&(saat<5))
            saat=4;
        else
            saat=3;
        return saat;
    }
}
