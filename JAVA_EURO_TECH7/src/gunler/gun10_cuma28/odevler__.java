package gunler.gun10_cuma28;

import java.util.Scanner;

public class odevler__ {

    public static void main(String[] args) {


        int sifre=1234;

        Scanner scan=new Scanner(System.in);


        while (true){

            System.out.println("bir sifre giriniz");

            int sayi= scan.nextInt();

            if (sayi == sifre) {


                System.out.println("sifre dogru");

                break;


            }else{


                System.out.println("sifre yanlis");
            }






        }





    }
}
