package gunler.gun6_pazartesi24;

import java.util.Scanner;

public class while_dongusu_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("sayiyi giriniz");
        int sayi = scan.nextInt();

        int faktoriel = 1;
        while (sayi >= 1) {

            faktoriel = faktoriel * sayi;
            System.out.println("Faktoriel " + faktoriel + "sayi " + sayi);
            sayi--;


        }
        System.out.println("faktoriel" + faktoriel);
    }
}