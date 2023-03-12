package gunler.gun22_sali15;

import java.util.Scanner;

public class alistirmaalr {

    public static void main(String[] args) {

        int number=20;

        for (int i = 2; i <number ; i++) {


            if(number%i==0){

                System.out.println("asal sayi degildir");
                break;


            }else {
                System.out.println("asal sayidir");
                break;
            }

        }


    }



}
