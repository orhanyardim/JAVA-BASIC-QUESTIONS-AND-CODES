public class diziToplamı {
    public static void main(String[] args) {
        int toplam=0;
        for(int i=1;i<60;i++){
            System.out.println(i+"*"+(i+1));
            toplam=toplam+(i*(i+1));
            i++;
            if(i==59)
                System.out.println("="+toplam);

        }
    }
}
