public class ucBasamakli {
    public static void main(String[] args) {

        int a,b,c,sayi=0;
        for(int i=100;i<1000;i++){
            a=i%10;
            b=((i-a)%100)/10;
            c=i/100;

            if(a!=b&b!=c&a!=c){
                System.out.println(i);
                sayi++;
            }
        }
            System.out.println("Adet: "+sayi);

    }
}

