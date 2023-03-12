package gunler.gun15_cuma4;

import java.util.Scanner;

public class for_loop_sembol {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


       int satirlar;
       int sutunlar;
       String sembol="";


        System.out.println("satir sayisi giriniz");
        satirlar=scan.nextInt();
        System.out.println("sutun sayisi gitriniz");
        sutunlar= scan.nextInt();
        System.out.println("sembol giriniz");
        sembol=scan.next();

        for (int i = 1; i <satirlar ; i++) {

            System.out.println();
            for (int j = 1; j <sutunlar ; j++) {

                System.out.print(sembol);

            }

        }

    }
}
