import java.util.Scanner;

public class harshadNumbers {
    public static void main(String[] args) {


        for(int i=1;i<1000;i++){
            int a=0;
            int toplam=0;
            if(i<10) {
                a = i % 10;
                if(harshadControl(a,a))
                    System.out.println(a);
            }
            else if(i<100){
                a=i%10;                         //ilk basamak bulunur
                toplam=a;                       //ilk basamak toplama aktarılır
                a=i-a;                          //ilk basamak çıkınca geriye kalan kısım a değişkenine aktarılır
                a=a/10;                         //ikinci basamak bulunur
                toplam=toplam+a;                //ikinci basasmak toplam değişkeni ile toplanır
                if(harshadControl(i,toplam))    //harshad kontrolü yapılır.
                    System.out.println(i);

            }
            else{
                a=i%10;                         //ilk basamak bulunur.
                toplam=a;                       //ilk basamak toplam değişkenine aktarılır.
                a=i-a;                          //ilk basamak çıkınca kalan değer a değikenine aktarılır
                a=(a%100)/10;                   //ikinci bassamak buunur.
                toplam=toplam+a;                //ikinci basamak toplam değişkeni ile toplanır
                a=i-a;                          //ikinci basamak da çıkınca kalan değer a değişkenine aktarılır
                a=a/100;                        //üçüncü basamak bulunur
                toplam=toplam+a;                //üçüncü basamak toplam değişeni ile toplanır.
                if(harshadControl(i,toplam))    //harshad kontrolü yapılır
                    System.out.println(i);
            }
        }
    }

    static boolean harshadControl(int number,int toplam){
        if(number%toplam==0)
            return true;
        else
            return false;
    }


}
