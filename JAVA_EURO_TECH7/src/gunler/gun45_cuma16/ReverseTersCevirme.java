package gunler.gun45_cuma16;

import java.util.Scanner;

public class ReverseTersCevirme {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String kelime="";

        System.out.println("bir kelime giriniz");
        String str=scan.nextLine();

        for (int i =str.length()-1; i >=0 ; i--) {

            kelime+=str.charAt(i);



        }
        System.out.println(kelime);
    }
}
