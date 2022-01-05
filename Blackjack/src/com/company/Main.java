package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scr=new Scanner(System.in);
        Cards card =new Cards();
        Player user=new Player();
        Player dealer=new Player();
        String res = "\u001B[0m"; //TO RESET CONSOLE COLOR
        boolean whileController=false;

        while(true){
            System.out.println("Cards drawing...");
            Thread.sleep(1000);
            giveCards(user,card);
            giveCards(dealer,card);
            giveCards(user,card);
            giveCards(dealer,card);
            System.out.println("---------------------Your Cards-------------------");
            user.printMyCards();
            System.out.println("---------------------Dealer Cards-------------------");
            System.out.println(dealer.myCards.get(0)+res+" Unknown");


            //USER INPUT PROCESSING
            while(true){
                System.out.println("------------HIT(H)---STAND(S)-----------------");
                char chr=scr.next().charAt(0);
                String str=String.valueOf(chr).toUpperCase(Locale.ROOT);

                if(str.equals("H")){
                    giveCards(user,card);
                    System.out.println("You are drawing cards...");
                    Thread.sleep(3000);
                    System.out.println("---------------------Your Cards-------------------");
                    user.printMyCards();
                    System.out.println("---------------------Dealer Cards-------------------");
                    System.out.println(dealer.myCards.get(0)+res+" Unknown");
                    if(user.getCardsCollect()>21){
                        System.out.println("You lost ");
                        whileController=true;  //TO BREAK 2 WHILE
                        break;
                    }
                }
                else
                    break;
            }
            if(whileController) //BREAKING THE WHILE IF GAME OVER
                break;

            System.out.println("Dealer is opening own cards...");
            Thread.sleep(5000);
            printState(user,dealer);

            while(dealer.getCardsCollect()<17){
               System.out.println("Dealer is drawing card...");
                Thread.sleep(5000);
                giveCards(dealer,card);
                printState(user,dealer);
            }

            if(dealer.getCardsCollect()<user.getCardsCollect()){
                System.out.println("You won");
                break;
            }
            else if(dealer.getCardsCollect()==user.getCardsCollect()){
                System.out.println("You won");
                break;
            }
            else{
                System.out.println("You lost");
                break;
            }

        }

    }

    static void giveCards(Player player,Cards card){
        card=card.drawCard();
        player.myCards.add(card.color+card.number);

    }

    static void printState(Player user,Player dealer){
        System.out.println("---------------------Your Cards-------------------");
        user.printMyCards();
        System.out.println("---------------------Dealer Cards-------------------");
        dealer.printMyCards();
    }
}
