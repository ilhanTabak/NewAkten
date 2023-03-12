package gunler.gun10_cuma28;

import java.util.Scanner;

public class While_dongusu_faktoriel {


    public static void main(String[] args) {


        int toplam=1;

        Scanner scan=new Scanner(System.in);

        System.out.println("bir sayi giriniz");

        int sayi= scan.nextInt();

        int i=0;

        while (i<sayi){

            toplam=toplam+toplam*i;

            i++;





        }


        System.out.println(toplam);




    }
}
