package gunler.gun13_carsamba2;

import java.util.Scanner;

public class java_deneme_projesi {


    public static void main(String[] args) {


        double ortalama;


        Scanner scan=new Scanner(System.in);

        System.out.println("fenbilgisi notu giriniz");
        int fen= scan.nextInt();

        System.out.println("turkce notu giriniz");
        int turkce= scan.nextInt();

        System.out.println("ingiliyce notu giriniz");
        int ingilizce= scan.nextInt();

        System.out.println("matematik notu giriniz");
        int matematik= scan.nextInt();

        ortalama=(fen+turkce+ingilizce+matematik)/4;


        if (ortalama<50) {
            System.out.println("kaldiniz");

        }

        else{
            System.out.println("gectiniz");
        }

    }
}
