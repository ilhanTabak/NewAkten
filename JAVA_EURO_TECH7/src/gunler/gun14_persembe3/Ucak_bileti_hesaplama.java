package gunler.gun14_persembe3;

import java.util.Scanner;

public class Ucak_bileti_hesaplama {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("gidceginiz mesafeyi giriniz");
        int uzaklik= scan.nextInt();

        System.out.println("yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("biletiniz gidis-donusse 1 e,degilse 2 ye basin");
        int seyahatTipi=scan.nextInt();


        //km basina 0.10 dollar
        //12 yasindan kucukse %50
        //12-24 yas arasi %10
        //65 buyukse %30
        //gidis donus %20 indirim


       double ucret1=uzaklik*0.10;

        if (seyahatTipi==1) {

            ucret1=ucret1-ucret1*0.2;

        }


        if (yas<12) {
            ucret1=ucret1/2;
        }

        else if(yas>11&&yas<24){

            ucret1=ucret1-ucret1/10;
        }

        else if(yas>65){

            ucret1=ucret1-ucret1*0.3;
        }

        System.out.println(ucret1);
    }


}
