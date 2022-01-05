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
    List<String> DrawedCards=new ArrayList<>();

    //PULL RANDOM CARD
    Random rnd=new Random();

    Cards  drawCard(){
        this.setNumber(CardNumbers[rnd.nextInt(0,13)]);
        this.setColor(CardColors[rnd.nextInt(0,4)]);

        if(!this.isAlreadyDrawed(this))
            return this;
        else
            return drawCard();

    }

    boolean isAlreadyDrawed(Cards pulledCard){

        if(DrawedCards.contains(this.number+this.color))
            return true;
        else{
            DrawedCards.add(this.number+this.color);
            return false;
        }
    }
}
