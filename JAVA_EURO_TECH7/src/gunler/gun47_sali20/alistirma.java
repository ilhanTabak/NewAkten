package gunler.gun47_sali20;

import java.util.Scanner;

public class alistirma {



    public static String strinler(){

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime yaziniz");
        String kelime=scan.nextLine();


       return kelime.toUpperCase();






    }






    public static void main(String[] args) {


        strinler();

    }
}
