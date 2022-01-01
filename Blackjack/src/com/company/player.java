package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

     private int cardsCollect=0;
      List<String> myCards=new ArrayList<>();

     /*public Player(){
         cardsCollect=0;
         seperateNumber();
     }*/
//-----------------------------------GET-SET-START-----------------------------------------
    public int getCardsCollect() {
         seperateNumber();
         return cardsCollect;
    }

    public void setCardsCollect(int cardsCollect) {
        this.cardsCollect = cardsCollect;
    }

    public List<String> getMyCards() {
        return myCards;
    }

    public void setMyCards(List<String> myCards) {
        this.myCards = myCards;
    }
//----------------------------------GET-SET-END---------------------------------------------

    private void seperateNumber(){
        cardsCollect=0;
         for (int i=0;i<myCards.size();i++){
             int number=0;
             char value=myCards.get(i).charAt(myCards.get(i).length()-1);
             if(value=='A'| value=='Q'|value=='J'|value=='K'|value=='0')
                 number=10;
             else
                 number=Character.getNumericValue(value);

             cardsCollect=cardsCollect+number;

         }

    }

    public void printMyCards(){
         for (int i=0;i< myCards.size();i++){
             System.out.print(myCards.get(i)+", ");
         }
    }
}
