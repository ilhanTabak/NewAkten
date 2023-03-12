package gunler.gun18_carsamba9;

import java.util.Scanner;

public class Cift_sayilari_bulan {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        while(true){

            System.out.println("Bir sayi giriniz");

            int sayi= scan.nextByte();

            if (sayi%2==0) {

                System.out.println("Tebrikler cift sayi girdiniz");

                break;

            }


        }

    }
}
