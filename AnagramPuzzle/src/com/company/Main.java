package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //CREATING NEW FILE
        File myFile=new File("words.txt");
        FileWriter fileWriter=new FileWriter(myFile,true);
        FileReader fileReader=new FileReader(myFile);
        BufferedReader bufReader=new BufferedReader(fileReader);
        ArrayList<String> linesList=new ArrayList<>();

        if(!myFile.exists())
            myFile.createNewFile();

        readFile(bufReader,linesList);
        System.out.println(linesList);

        //CREATING RANDOM NUMBER TO DRAW WORD
        Random rnd=new Random();
        String drawedWord=linesList.get(rnd.nextInt(linesList.size()));
        System.out.println(drawedWord);

        StringBuilder strb=new StringBuilder(drawedWord);
        //THE WORD IS MIXING
        char[] temp=new char[drawedWord.length()];
        int len=drawedWord.length();

        for(int i=0;i<drawedWord.length();i++){
            int rndIndex=rnd.nextInt(len);
            temp[i]=strb.charAt(rndIndex);
            strb.deleteCharAt(rndIndex);
            len--;
        }

        System.out.println(temp);

    }

    //READING FILE LINE BY LINE
    public static void readFile(BufferedReader file_reader,ArrayList<String> lines_List)throws IOException{
        String line;
        while((line=file_reader.readLine())!=null){
            lines_List.add(line);
        }


    }
}
