import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("a=");
        int a=scr.nextInt();
        System.out.print("b=");
        int b=scr.nextInt();
        if(a>b){
            int tut=a;
            a=b;
            b=tut;
        }

        if(a<=2)
            System.out.print("2-");
        for(int i=a;i<=b;i++){

            for (int j = 2; j < i; j++)

                if (i % j == 0)
                    break;

                else if(j==i-1)
                    System.out.print(i+"-");

        }

    }
}
