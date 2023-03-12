package gunler.gun6_pazartesi24;

import java.util.Scanner;

public class while_ornek {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("bir rakam giriniz");

        int sayi= scan.nextInt();

        while(sayi>=1){

            int atma=1;

            atma=atma*sayi;

            sayi--;
            System.out.println("atma"+atma+"sayi"+sayi);



        }

    }
}
