package gunler.gun14_persembe3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class arrays_dersi_3 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("1.oyuncu isminizi giriniz");

        String birinci=scan.next();

        System.out.println("2.oyuncu isminizi giriniz");

        String ikinci=scan.next();



        int numara=4;
        int i=0;

        while (i<6){
            System.out.println(birinci+" bir sayi giriniz");

            int tahminbirinci=scan.nextInt();

            System.out.println(ikinci+"bir sayi giriniz");

            int tahminikinci=scan.nextInt();

            if (tahminbirinci==numara) {

                System.out.println(birinci+" kazandi");

            }

            else if(tahminikinci==numara){
                System.out.println(ikinci+" kazandi");
            }
        }

        i++;








    }
}