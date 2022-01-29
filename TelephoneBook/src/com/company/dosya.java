package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class dosya {

    File file;
    FileWriter fileWriter;
    BufferedWriter bufwriter;
    FileReader filereader;
    BufferedReader bufreader;
    RandomAccessFile raf;

    //CONSTRUCTOR
    public dosya (String path,boolean append) throws IOException{
        File file=new File(path);
        FileWriter fileWriter=new FileWriter(file,append);
        BufferedWriter bufwriter=new BufferedWriter(fileWriter);
        FileReader filereader=new FileReader(file);
        BufferedReader bufreader=new BufferedReader(filereader);
        RandomAccessFile raf=new RandomAccessFile(path,"rw");
        this.file=file;
        this.fileWriter=fileWriter;
        this.filereader=filereader;
        this.bufwriter=bufwriter;
        this.bufreader=bufreader;
        this.raf=raf;
        if(!file.exists()) {
            file.createNewFile();
        }

    }

    public ArrayList readFile()throws IOException{
        ArrayList<String> lines=new ArrayList<String>();
        bufreader.mark(1000);
        String str;
        while ((str=bufreader.readLine())!=null) {
            lines.add(str);
        }

        bufreader.reset();

        return lines;
    }

    public void writeFile(String sentences)throws IOException{

        bufwriter.newLine();
        bufwriter.write(sentences);

        bufwriter.flush();
    }
    public void deleteFile()throws IOException{
        file.delete();
    }
    /*public String kelimecek(ArrayList kelimeler)throws IOException{
        Random rnd=new Random();
        return kelimeler.get(rnd.nextInt(oku().size())).toString();

    }*/
    public String searchNumber(String Name) throws IOException{
        ArrayList<String> lines=readFile();
        Name=Name.toLowerCase(Locale.ROOT);
        int index=0;
        for(int i=0;i<lines.size();i+=2){
            if(lines.get(i).toLowerCase(Locale.ROOT).equals(Name)){
                index=i;
                System.out.println("Name:"+lines.get(index));
                break;
            }
            else if(i==lines.size()-2){
                return "Not Found";
            }
        }
        return lines.get(index+1);

    }

    public void update(String updateValue) throws IOException{
        ArrayList<String> lines=readFile();
        updateValue=updateValue.toLowerCase(Locale.ROOT);
        int collectChr=0;

        for(int i=0;i<lines.size();i++){
            BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
            collectChr=collectChr+lines.get(i).length()+3;
            if(lines.get(i).toLowerCase(Locale.ROOT).equals(updateValue)){
                String newNumber;
                while(true){
                    System.out.print("Current number:"+lines.get(i+1)+"\nPlease enter the new number\nNew Number:");
                    newNumber=input.readLine();
                    if(newNumber.length()!=11 | newNumber.charAt(0)!='0'){
                        System.out.println("Please put 0 head of number and number must be 11 character");
                    }
                    else
                        break;
                }
                byte numberByte[]=newNumber.getBytes();
                raf.seek(collectChr+1);
                raf.write(numberByte);
                //raf.close();

                System.out.println("The Number changing is succesful.");
                break;
            }
            else if(i== lines.size()-1){
                System.out.println("Name is not found");
            }
        }
    }
}
