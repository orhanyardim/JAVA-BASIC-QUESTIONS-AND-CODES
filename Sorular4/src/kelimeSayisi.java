import java.util.Scanner;

public class kelimeSayisi {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        String sentence=scr.nextLine();
        int counter=0;
        char character;
        int index=0;

        for(int i=0;i<sentence.length();i++){
            character=sentence.charAt(i);
            if(character==32){
                if((i!=0)&&(sentence.charAt(i-1)!=32)){
                    counter++;
                    System.out.println(sentence.substring(index,i));
                    index=i+1;
                }


            }
            else if(i==sentence.length()-1){
                System.out.println(sentence.substring(index,i+1));
                counter++;
            }

        }
        System.out.println("Word Count:"+counter);

    }
}



