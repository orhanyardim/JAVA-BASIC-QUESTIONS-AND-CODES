import java.util.Scanner;

public class enazBanknot {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        int money= scr.nextInt();


        class Banknot{
            static int banknot1=0;
            static int banknot5=0;
            static int banknot10=0;
            static int banknot20=0;
            static int banknot50=0;
            static int banknot100=0;
            static int banknot200=0;

        }


        for(;;){
            if(money>=200){
                money=money-200;
                Banknot.banknot200++;
                if(money==0)
                    break;
            }
            else if(money>=100){
                money=money-100;
                Banknot.banknot100++;
                if(money==0)
                    break;
            }
            else if(money>=50){
                money=money-50;
                Banknot.banknot50++;
                if(money==0)
                    break;
            }
            else if(money>=20){
                money-=20;
                Banknot.banknot20++;
                if(money==0)
                    break;
            }
            else if(money>=10){
                money-=10;
                Banknot.banknot10++;
                if(money==0)
                    break;
            }
            else if(money>=5){
                money-=5;
                Banknot.banknot5++;
                if(money==0)
                    break;
            }
            else{
                money-=1;
                Banknot.banknot1++;

                if(money==0)
                    break;
            }

        }
        System.out.println("Banknot Sayısı:"+(Banknot.banknot200+Banknot.banknot100+Banknot.banknot50+Banknot.banknot20+Banknot.banknot10+Banknot.banknot5+Banknot.banknot1));
        System.out.println("200-->"+Banknot.banknot200);
        System.out.println("100-->"+Banknot.banknot100);
        System.out.println("50-->"+Banknot.banknot50);
        System.out.println("20-->"+Banknot.banknot20);
        System.out.println("10-->"+Banknot.banknot10);
        System.out.println("5-->"+Banknot.banknot5);
        System.out.println("1-->"+Banknot.banknot1);
    }
}
