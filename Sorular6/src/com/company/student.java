package com.company;

public class student {
    private String name;
    private String id;
    private int credits;

    //DEFAULT CONFİGURATİON
    public  student(String fullname,String studentID){
        this.name=fullname;
        this.id=studentID;
        this.credits=0;
    }

    //NAME ENCAPSULATİON
    public void setName(String nameset){
        this.name=nameset;
    }
    public String getName(){

        return name;
    }
    //ID ENCAPSULATİON
    public void setID(String IDset){

        this.id=IDset;
    }
    public String getID(){

        return id;
    }
    //CREDITS ENCAPSULATİON
    public void setCredits(int creditsset){

        this.credits=creditsset;
    }
    public int getCredits(){
        if(credits<240)
            System.out.println("Mezun Değil");
        else
            System.out.println("Mezun");
        return credits;
    }


}
