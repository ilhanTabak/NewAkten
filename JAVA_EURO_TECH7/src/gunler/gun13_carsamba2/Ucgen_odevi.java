package gunler.gun13_carsamba2;

import java.util.Scanner;

public class Ucgen_odevi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi1, sayi2;

        System.out.println("bir sayi giriniz :");

        sayi1 = scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        sayi2 = scan.nextInt();

        System.out.println("hangi islemi yapkam istediginizi seciniz carpmaicin 1,toplama icin 2,bolme icin 3,cikarma icin 4 e basiniz");

        int islemTipi = scan.nextInt();

        if(islemTipi==1){

            System.out.println("sonuc: "+(sayi1+sayi2));
        }

        if(islemTipi==2){

            System.out.println("sonuc: "+(sayi1/sayi2));
        }

        if(islemTipi==3){

            System.out.println("sonuc: "+sayi1*sayi2);
        }

        if(islemTipi==4){

            System.out.println("sonuc: "+(sayi1-sayi2));
        }


    }


}

