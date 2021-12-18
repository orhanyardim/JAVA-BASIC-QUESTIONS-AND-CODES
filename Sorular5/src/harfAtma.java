import java.util.Scanner;

public class harfAtma {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String sentence=scr.nextLine();
        StringBuilder strb=new StringBuilder(sentence);
        int sayac=0;
        int tut=0;


        for(int i=0;i<strb.length()-1;i++){
            if(strb.charAt(i)==strb.charAt(i+1)){
                for(int j=i;j<strb.length();j++){
                    if(strb.charAt(i)==strb.charAt(j))
                        sayac++;

                    else {

                        break;
                    }
                }
                strb.delete(i,i+sayac);

                sayac=0;
                i--;
            }
        }
        System.out.println(strb);

    }
}
