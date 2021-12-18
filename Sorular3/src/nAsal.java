import java.util.Scanner;

public class nAsal {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        int N= scr.nextInt();
        if(N>=1){
            for(int i=N;;i++){
                if(asalControl(i+1)) {
                    N--;
                    if(N==0) {
                        System.out.println(i+1);
                        break;
                    }
                }
            }

        }
        else System.out.println("N sayısı N>=1 şartını karşılamalıdır");

    }

    static boolean asalControl(int sayi){
        if(sayi==2)
            return true;
        else{
            for(int i=2;i<sayi;i++){
                if(sayi%i==0){
                    return false;

                }
                else if(i==sayi-1)
                    return true;


            }
        }

        return false;
    }
}
