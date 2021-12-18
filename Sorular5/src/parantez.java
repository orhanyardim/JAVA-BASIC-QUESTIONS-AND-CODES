import java.util.Scanner;

public class parantez {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String myStr=scr.nextLine();
        int countOfForeBracket=0;
        int countOfBackBracket=0;

        for(int i=0;i<myStr.length();i++){
            if(myStr.charAt(i)=='(')
                countOfForeBracket++;
            else if(myStr.charAt(i)==')')
                countOfBackBracket++;
        }
        if(countOfBackBracket==countOfForeBracket)
            System.out.println("İfade doğru biçimdedir.");
        else
            System.out.println("İfade doğru biçimde değildir.");


    }
}
