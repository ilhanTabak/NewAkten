package gunler.gun10_cuma28;

import java.util.Scanner;

public class Faktoriel_fonksiyon {


    public static void faktoriel(){


        Scanner scan=new Scanner(System.in);

        System.out.println("sayi");

        int sayi= scan.nextInt();
        int faktoriel=1;

        while (sayi>0){

            faktoriel*=sayi;
            sayi--;

        }

        System.out.println("faktoriel: "+faktoriel);

    }




    public static void main(String[] args) {

        faktoriel();
        faktoriel();

    }


}
