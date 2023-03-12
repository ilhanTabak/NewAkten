package gunler.gun23_carsamba16;

import java.util.Scanner;

public class FaktorielYenicalisma {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        System.out.println("bir sayi giriniz");

        int sayi= scan.nextInt();
        long faktoriel=1;

        for (int i = sayi; i >=1 ; i--) {

            faktoriel=faktoriel*i;


        }

        System.out.println(faktoriel);
    }
}
