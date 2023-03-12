package gunler.gun6_pazartesi24;

import java.util.Scanner;

public class Switch_case {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");

        int sayi=scan.nextInt();

        switch(sayi){
            case 1:
                System.out.println("sayi bire esit");
                break;
            case 2:
                System.out.println("sayi ikiye esit");
                break;
            case 3:
                System.out.println("sayi uce esit");
                break;
            default:
                System.out.println("sayi bire ikye veya uce esit degil");
        }
    }
}
