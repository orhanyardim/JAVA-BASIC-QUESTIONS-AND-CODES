import java.util.Random;

public class random5to30 {
    public static void main(String[] args) {
        Random rnd=new Random();

        int[] a=new int[10];
        int[] b=new int[10];
        int tut=0;
        int index=0;
        for(int i=0;i<10;i++){
            int x= rnd.nextInt(25)+5;
            a[i]=x;
            b[i]=x;

        }
        for(int x:a)
            System.out.println(x);
        for(int i=0;i<9;i++){
            if(a[i]>=a[i+1]){
                tut=a[i];
                a[i]=a[i+1];
                a[i+1]=tut;

            }
            else
                tut=a[i+1];
        }
        for(int i=0;i<10;i++){
            if(b[i]==tut)
                index=i;
        }

        System.out.println("En büyük eleman: "+tut+"\n index: "+index);
    }

}
