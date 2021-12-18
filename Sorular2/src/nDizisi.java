import java.util.Scanner;

public class nDizisi {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Lütfen N değerini giriniz\nN=");
        int N=scr.nextInt();


        for(int i=1;i<N;i=i+2)
        {
            System.out.println(i);
        }
        for(int i=N;i>=0;i=i-2){
            if(N%2==0)
                System.out.println(i);
            else {
                N++;
                i=i+3;
                System.out.println(i-3);

            }

        }



    }
}
