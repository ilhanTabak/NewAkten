package gunler.gun5_cuma21;

import java.util.Scanner;

public class switch2dersi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi=scan.nextInt();
        switch (sayi){
            case 1:
                System.out.println("Bir");
                break;

            case 2:
                System.out.println("iki");
                break;

            case 3:
                System.out.println("uc");
                break;

            case 4:
                System.out.println("dort1");
                break;

            default:
                System.out.println("gecersiy sayi");

        }
    }
}
