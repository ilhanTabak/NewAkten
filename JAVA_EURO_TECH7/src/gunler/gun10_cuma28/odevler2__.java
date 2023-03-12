package gunler.gun10_cuma28;

import java.util.Scanner;

public class odevler2__ {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("bir rakam giriniz");

        int a=0;

        int terim=scan.nextInt();


        for (int i = 0; i < terim; i++) {

            a=a+i;



            System.out.println(a);




        }


    }


}
