package gunler.gun1_pazartesi17;

import java.util.Scanner;

public class asal_Sayi {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int number=scan.nextInt();


        int sayac = 0;

        for (int i = 2; i < 10; i++) {

            if (number % i == 0) {

                sayac++;

                if (i/number==1) {

                    sayac=sayac-1;

                }
            }
        }

        if (sayac == 0) {

            System.out.println("sayi asal");

        } else {
            System.out.println("asal degil");

        }
    }
}











