package gunler.gun21_pazartesi14;

import java.util.Scanner;

public class KarmasikDiziornegi {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        int sayilar[]=new int[10];
        int tumToplam=0;
        int ilkSonToplam=0;

        for (int i = 0; i <10 ; i++) {

            System.out.println("sayi giriniz");
            sayilar[i]=scan.nextInt();
            tumToplam+=sayilar[i];



        }

        ilkSonToplam=sayilar[0]+sayilar[9];

        double oran=ilkSonToplam/tumToplam;

        System.out.println(tumToplam);
        System.out.println(ilkSonToplam);
        System.out.println(oran);

    }

}
