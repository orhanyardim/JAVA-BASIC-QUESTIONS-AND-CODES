public class nufusHesaplama {
    static int a=0;
    public static void main(String[] args) {
        double nufus=79814871;
        //her yıl %1.35
        //kaç yılında 100 milyonu aşar.
        System.out.println(2016+yillikArtis(nufus)+" yılında nüfus 100 milyonu aşar");

    }
    public static int yillikArtis(double yeninufus ){
        yeninufus=yeninufus+(yeninufus*(1.35/100));
        if(yeninufus>100000000)
            return a;
        else {
            a++;
            return yillikArtis(yeninufus);
        }


    }
}
