package gunler.gun8_carsamba26;

import java.util.Scanner;

public class Kdv_hesaplama {


    public static void main(String[] args) {

        double tutar;
        double kdvliFiyat;
        double kdv=0.18;

       Scanner scan=new Scanner(System.in);

        System.out.println("urunun tutarini giriniz");


        tutar=scan.nextDouble();

        kdvliFiyat=tutar+(tutar*kdv);

        System.out.println("kdvli fiyat: "+kdvliFiyat );



    }
}
