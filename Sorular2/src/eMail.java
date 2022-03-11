import java.util.Scanner;

public class eMail {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("eMail=");
        String email=scr.nextLine();
        String ad=null,soyad=null,provider=null,domain=null;

        int noktaindex=0;
        int nokta2index=0;
        int kontrol=0;
        

        for(int i=0;i<email.length();i++){

            if(email.charAt(i)=='.'&kontrol==0){
                ad=email.substring(0,i);
                noktaindex=i;
                kontrol=1;
            }

             if(email.charAt(i)=='@'&kontrol==1) {
                soyad = email.substring(noktaindex+1, i);
                atindex = i;
                kontrol=2;
            }

            if(email.charAt(i)=='.'& kontrol==2){
                provider=email.substring(atindex,i);
                nokta2index=i;
                kontrol=3;

            }

            if((nokta2index!=email.length()-1)&(kontrol==3)) {
                domain = email.substring(nokta2index, email.length());
                kontrol=4;
            }

        }
        if(kontrol==4){
            System.out.println("Ad:"+ad);
            System.out.println("Soyad:"+soyad);
            System.out.println("Sağlayıcı:"+provider);
            System.out.println("Domain:"+domain);
        }
        else {
            System.out.println("email ad.soyad@domain.com formatında olmalıdır");
            main(args);
        }
    }
}
