package gunler.gun18_carsamba9;

import java.util.Scanner;

public class danemeler5 {


    public static void main(String[] args) {

        int buyukSayi=0;
        int kucukSayi=0;

        int toplamCift = 0;
        int toplamTek=0;

        Scanner scan=new Scanner(System.in);

        System.out.println("birinci sayiyi giriniz");

        int sayi1= scan.nextInt();

        System.out.println("ikinci sayiyi giriniz");

        int sayi2= scan.nextInt();

        if(sayi1>sayi2){

            buyukSayi=sayi1;
            kucukSayi=sayi2;

        }else{
            kucukSayi=sayi1;
            buyukSayi=sayi2;
        }

        for (int i = kucukSayi; i <buyukSayi ; i++) {

            if (i%2==0) {

                toplamCift=toplamCift+i;

            }else{

                toplamTek=toplamTek+i;
            }


            System.out.println("ciftler "+ toplamCift+" tekler"+ toplamTek);
        }


    }
}
