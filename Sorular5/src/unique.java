import java.util.Locale;
import java.util.Scanner;

public class unique {
    static int index=1;
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        String word=scr.nextLine();
        word=word.toLowerCase(Locale.ROOT);
        char[] temp=new char[word.length()];


        for(int i=0;i<word.length();i++){

            if(i==0)
                temp[i]=word.charAt(i);
            else if( !isThere(word.charAt(i),word,temp)){

                temp[index]=word.charAt(i);
                index++;
            }

        }

        for(int i=0;i<index;i++)
            System.out.print(temp[i]+"-");
    }

    static boolean isThere(char character,String word,char[] temp){
        for(int i=0;i<word.length();i++){
            if(temp[i]==character) {

                return true;

            }
            else if(i==word.length()-1)
                return false;
        }
        return true;
    }
}
