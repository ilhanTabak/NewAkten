package gunler.gun7_sali25;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int sayi = scan.nextInt();
        int toplam = 0;

        do {
            toplam = toplam + sayi % 10;
            sayi=sayi/10;
            System.out.println("toplam "+toplam+"sayi "+sayi);

        }

       while(sayi>0);
    }

}
