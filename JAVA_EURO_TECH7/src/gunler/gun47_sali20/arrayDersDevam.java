package gunler.gun47_sali20;

import java.util.Arrays;

import java.util.Scanner;

public class arrayDersDevam {


    public static void forLoopPrint(String[]aa){

        for (int i = 0; i <aa.length ; i++) {

            System.out.println(aa[i]);


        }


    }


    public static void main(String[] args) {


        System.out.println("arrays in java");

        String[]ogrenciListesi={"ahmet","mehmet","merry"};


        for (int i = 0; i <ogrenciListesi.length ; i++) {

            System.out.println(ogrenciListesi[i]);

        }
        for (String aa:ogrenciListesi) {


            System.out.println(aa);

        }

        System.out.print(Arrays.toString(ogrenciListesi));

        String[]ali={"aa","bb","cc"};


        forLoopPrint(ali);
        forLoopPrint(ogrenciListesi);


        alistirma.strinler();









    }
}
