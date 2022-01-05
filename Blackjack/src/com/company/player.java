package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String res = "\u001B[0m"; //TO RESET CONSOLE COLOR
    private int cardsCollect=0;
      List<String> myCards=new ArrayList<>();

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
        boolean isThere_A=false;
         for (int i=0;i<myCards.size();i++){
             int number=0;
             char value=myCards.get(i).charAt(myCards.get(i).length()-1);
             if(value=='Q'|value=='J'|value=='K'|value=='0')
                 number=10;
             else if(value=='A'){
                 isThere_A=true;
             }
             else
                 number=Character.getNumericValue(value);

             cardsCollect=cardsCollect+number;

         }
         if(isThere_A){
             if(cardsCollect+11<=21)
                 cardsCollect=cardsCollect+11;
             else
                 cardsCollect++;
         }

    }

    public void printMyCards(){
        seperateNumber();
         for (int i=0;i< myCards.size();i++){
             System.out.print(myCards.get(i)+", ");

         }
         System.out.println(res+"Cards Collect="+cardsCollect);
    }
}
