import java.util.Scanner;

public class sekenTop {

    public static void main(String[] args) {

        double h=5;
        int bounceCounter=0;
        double totalDistance=-5;

        for(;;){
            if(totalDistance>=20){
                System.out.println("Sekme Sayisi:"+(bounceCounter-1));

                break;
            }
            else{
                totalDistance=totalDistance+2*h;
                System.out.println("Zıplama Yüksekliği:"+h);
                h=(h*4)/5;
                bounceCounter++;
                System.out.println("Alınan Yol:"+totalDistance);
                System.out.println("=======================================================");
            }

        }


    }



}
