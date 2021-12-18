import java.util.Locale;
import java.util.Scanner;

public class benzerlik {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String word=scr.nextLine();
        System.out.println("Lütfen "+word.length()+" uzunluğunda bir string giriniz.");
        String word2=scr.nextLine();

        word.toLowerCase(Locale.ROOT);
        word2.toLowerCase(Locale.ROOT);
        double oran=0;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==word2.charAt(i))
                oran=oran+100/word.length();
        }
        System.out.println("Benzerlik oranı:% "+oran);


    }
}
