package gunler.gun37_sali06;

import java.util.Scanner;

public class TahminOyunu {


    public static void main(String[] args) {


        int sayi=25;


        Scanner scan=new Scanner(System.in);

        System.out.println("bir ile 30 arasinda bir sayi giriniz");

        int tahmin=scan.nextInt();
        if(tahmin<25){

            System.out.println("buyuk bir sayi giriniz");
        } else if (tahmin>25) {
            System.out.println("kucuk bir sayi giriniz");

        } else if (tahmin==sayi) {
            System.out.println("sayiyi bldunuz");

        }


    }




}
