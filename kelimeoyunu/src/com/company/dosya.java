package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class dosya {

    File file;
    FileWriter fileWriter;
    BufferedWriter bufwriter;
    FileReader filereader;
    BufferedReader bufreader;

    //CONSTRUCTOR
    public dosya (String path,boolean append) throws IOException{
        File file=new File(path);
        FileWriter fileWriter=new FileWriter(file,append);
        BufferedWriter bufwriter=new BufferedWriter(fileWriter);
        FileReader filereader=new FileReader(file);
        BufferedReader bufreader=new BufferedReader(filereader);
        this.file=file;
        this.fileWriter=fileWriter;
        this.filereader=filereader;
        this.bufwriter=bufwriter;
        this.bufreader=bufreader;
        if(!file.exists()) {
            file.createNewFile();
        }

    }

    public ArrayList oku()throws IOException{
        ArrayList<String> lines=new ArrayList<String>();
        bufreader.mark(1000);
        String str;
        while ((str=bufreader.readLine())!=null) {
            lines.add(str);

        }
        //System.out.println(lines.size());
        bufreader.reset();

        return lines;
    }

    public void yaz(String sentences)throws IOException{
        bufwriter.newLine();
        bufwriter.write(sentences);

        bufwriter.close();
    }
    public void sil()throws IOException{
        file.delete();
    }
    public String kelimecek(ArrayList kelimeler)throws IOException{
        Random rnd=new Random();
        return kelimeler.get(rnd.nextInt(oku().size())).toString();

    }

}
