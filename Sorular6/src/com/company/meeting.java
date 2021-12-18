package com.company;

public class meeting {
    String time;
    String location;
    String subject;

    //CONSTRUCTOR
    public meeting(String Time,String Location,String Subject){
        this.time=Time;
        this.location=Location;
        this.subject=Subject;
    }

    //PRINTDETAILS
    public void printDetails(){
        System.out.println("Time:"+time+"\nLocation:"+location+"\nSubject:"+subject);
    }

    //TIME ENCAPSULATION
    public void setTime(String time) {
        this.time = time;
    }
    public String getTime(){

        return time;
    }

    //LOCATION ENCAPSULATION
    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation(){

        return location;
    }

    //SUBJECT ENCAPSULATION
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject(){

        return subject;
    }
}
