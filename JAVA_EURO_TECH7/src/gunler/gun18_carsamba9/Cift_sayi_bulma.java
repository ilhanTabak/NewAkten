package gunler.gun18_carsamba9;

import java.util.Scanner;

public class Cift_sayi_bulma {

    public static void main(String[] args) {


        int buyuksayi = 0;
        int kucuksayi = 0;


        Scanner scan = new Scanner(System.in);


        System.out.println("birinci sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = scan.nextInt();

        if (sayi1 > sayi2) {


            buyuksayi=sayi1;
            kucuksayi=sayi2;

        } else {
            buyuksayi=sayi2;
            kucuksayi=sayi1;

        }
                while(kucuksayi<buyuksayi) {

                    if (kucuksayi%2==0) {


                        System.out.println(kucuksayi);





                    }

                     kucuksayi++;





                    }


                }

            }





