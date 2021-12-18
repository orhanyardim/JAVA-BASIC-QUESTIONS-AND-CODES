import java.util.Random;

public class kacBasamakli {
    public  static void main(String[] args) {
        Random rnd=new Random();
        int a=rnd.nextInt(250,100000);//aslında javada sadece max girilebilir.Bu deneyseldir
        System.out.println("Sayı="+a);
        int i=0;
        for(;;i++){
            if(a>=10)
                a=a/10;
            else break;


        }
        System.out.println(i+1+" basamaklıdır");
    }
}
