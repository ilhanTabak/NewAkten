package gunler.gun25_cuma18;

import java.util.Scanner;

public class NegatifDegerGirileneKadar {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);



        while (true){

            System.out.println("bir sayi giriniz");
            int sayi=scan.nextInt();

            if(sayi<0&&sayi%2==0){

                System.out.println("negatif bir deger girdiniz");

                break;


            }


        }



    }
}
