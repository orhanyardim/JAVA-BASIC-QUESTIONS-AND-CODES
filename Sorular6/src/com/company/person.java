package com.company;

public class person {
    String ad;
    int yas;

    //CONSTRUCTOR

    public person(String Ad,int Yas){
        this.ad=Ad;
        this.yas=Yas;

    }

    public void setAd(String ad) {

        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getYas() {
        return yas;
    }

}

class teacher extends person{
    String branch;
    int startyear;
    public teacher(String Branch,int Startyear,String Ad,int Yas){
        super(Ad,Yas);
        this.branch=Branch;
        this.startyear=Startyear;
    }
    public int startYear(){

        return 2021-startyear;
    }
}

class ogrenci extends person{
    int sinif;
    int akts;

    public ogrenci(int Sinif,int Akts,String Ad,int Yas){
        super(Ad,Yas);
        this.sinif=Sinif;
        this.akts=Akts;
    }

    public void incAkts(){
        akts=akts+1;
    }
}