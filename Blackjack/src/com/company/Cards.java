package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cards {
    //HEART=Kupa,DIAMOND=Karo,CLUB=Sinek,SPADES=Maça "THESE FOR MY NATIONAL LANGUAGE :D"

   //--------------------------GET-SET-START-----------------------------------------------
    char number;
    String color;

    private String getColor(){
        return color;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private int getNumber() {
        return number;
    }

    private void setNumber(char number) {
        this.number = number;
    }
  //-----------------------------GET-SET-END--------------------------------------------------

    
    //ARRAY OF NUMBERS
    char CardNumbers[]={'A','2','3','4','5','6','7','8','9','0','J','Q','K'};//     '0' IS MEANS NUMBER 10!!!

    //ARRAY OF COLORS
    String club="\u001B[30m";  String heart="\u001B[31m";
    String diamonds="\u001B[35m"; String spades="\u001B[34m";
    String CardColors[]={club,heart,diamonds,spades};//{black:club,red:heart,purple:diamond,blue:spades}


    //ARRAYLIST OF PULLEDCARDS
    List<String> PulledCards=new ArrayList<>();

    //PULL RANDOM CARD
    Random rnd=new Random();

    Cards  pullCard(){
        this.setNumber(CardNumbers[rnd.nextInt(0,13)]);
        this.setColor(CardColors[rnd.nextInt(0,4)]);

        if(!this.isAlreadyPulled(this))
            return this;
        else
            return pullCard();

    }

    boolean isAlreadyPulled(Cards pulledCard){


        if(PulledCards.contains(this.number+this.color))
            return true;
        else{
            PulledCards.add(this.number+this.color);
            return false;
        }
        /*for(int i=0;i<PulledCards.size();i++){
            if(PulledCards.get(i)==cardtemp.number+cardtemp.color)
                return false;
            else if(i==PulledCards.size()-1)
                PulledCards.add(cardtemp.number+cardtemp.color);
        }*/


    }







}
