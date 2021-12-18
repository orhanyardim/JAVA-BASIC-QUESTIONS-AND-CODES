import java.util.Scanner;

public class shift {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.println("Lütfen kelimeyi giriniz");
        String word=scr.nextLine();

        String word2=new String();

        System.out.println("Kayma miktari:");
        int shiftAmount= scr.nextInt();

        System.out.println("Yön(1/0):");
        int way= scr.nextInt();

        int length=word.length();

        if(way==1){

            word2=word.substring(length-shiftAmount,length);
            word2+=word.substring(0,length-shiftAmount);
            System.out.println(word2);
        }
        else if(way==0){

            word2=word.substring(shiftAmount,length);
            word2+=word.substring(0,shiftAmount);
            System.out.println(word2);
        }


    }
}
