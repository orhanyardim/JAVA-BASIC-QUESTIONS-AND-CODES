import java.util.Arrays;
import java.util.Random;

public class randomDizi {
    public static void main(String[] args) {
        Random rnd=new Random();

        int X[]=new int[5];
        int Y[]=new int[5];
        int Z[]=new int[5];


        for(int i=0;i<5;i++){
            X[i]= rnd.nextInt(12,23);
            Y[i]= rnd.nextInt(12,23);
        }

        //X'İN ARİTMETİK ORTALAMASI
        int sum=0;

        for(int i=0;i<5;i++){
            sum=sum+X[i];
            if(i==4)
                System.out.println("X art. ort. ="+(sum/5));
        }
        //X'İN ORTALAMASININ Y ELEMANLARI İLE ÇARPILIP Z DİZİSİNE AKTARMA

        for(int i=0;i<5;i++){
            Z[i]=(sum/5)*Y[i];

        }
        //Y VE Z DİZİLERİNİ ARİTMETİK ORTALAMASI

        int sumZ=0;
        int sumY=0;

        for(int i=0;i<5;i++){
            sumY=sumY+Y[i];
            sumZ=sumZ+Z[i];

            if(i==4){
                System.out.println("Y art. ort. ="+(sumY/5));
                System.out.println("Z art. ort. ="+(sumZ/5));
            }
        }
        //SON HALİYLE X,Y,Z DİZİLERİNİ YAZDIR
        System.out.println("================================================");
        for(int i=0;i<5;i++){
            System.out.println("X["+i+"]="+X[i]+", Y["+i+"]="+Y[i]+", Z["+i+"]="+Z[i] );
        }


    }


}
