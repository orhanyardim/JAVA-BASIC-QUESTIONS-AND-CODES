public class arabaSatis {
    public static void main(String[] args) {
        int[][] tablo=new int[5][3];
        tablo[0][0]=700;tablo[0][1]=600;tablo[0][2]=650;
        tablo[1][0]=900;tablo[1][1]=800;tablo[1][2]=700;
        tablo[2][0]=300;tablo[2][1]=400;tablo[2][2]=350;
        tablo[3][0]=500;tablo[3][1]=450;tablo[3][2]=470;
        tablo[4][0]=600;tablo[4][1]=500;tablo[4][2]=480;

        System.out.println("-----3 AYLIK TOPLAM-----");
        System.out.println("Fiat:    "+tablo[0][0]+" "+tablo[0][1]+" "+tablo[0][2]);
        System.out.println("Renault: "+tablo[1][0]+" "+tablo[1][1]+" "+tablo[1][2]);
        System.out.println("VW:      "+tablo[2][0]+" "+tablo[2][1]+" "+tablo[3][2]);
        System.out.println("Opel:    "+tablo[3][0]+" "+tablo[3][1]+" "+tablo[3][2]);
        System.out.println("Ford:    "+tablo[4][0]+" "+tablo[4][1]+" "+tablo[4][2]);

        System.out.println("-----AYLIK GENEL TOPLAM-----");

        int toplam=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                toplam=toplam+tablo[j][i];
                if(j==4&i==0)
                    System.out.println("Ocak:"+toplam);
                else if(j==4&i==1)
                    System.out.println("Şubat:"+toplam);
                else if(j==4&i==2)
                    System.out.println("Mart:"+toplam);

            }

        }


        System.out.println("----EN YÜKSEK SATIŞ YAPILAN AY----");
        System.out.println("Fiat:Ocak");
        System.out.println("Renault:Ocak");
        System.out.println("VW:Şubat");
        System.out.println("Opel:Ocak");
        System.out.println("Ford:Ocak");

        System.out.println("----HER AY İÇİN EN YÜKSEK SATIŞ KİMDE----");
        System.out.println("Ocak:Renault");
        System.out.println("Şubat:Renault");
        System.out.println("Mart:Renault");

        System.out.println("----3 AYDA SATILAN TOPLAM OTOMOBİL----");
        toplam=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                toplam=toplam+tablo[j][i];
                if(i==2&j==4)
                    System.out.println(toplam);

            }

        }










    }
}
