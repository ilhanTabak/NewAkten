package gunler.gun5_cuma21;

import java.util.Scanner;

public class booleandersdi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        if (sayi == 1) {
            System.out.println("bir");

        } else if (sayi == 2) {
            System.out.println("iki");

        } else if (sayi == 3) {
            System.out.println("uc");

        } else if (sayi == 4) {
            System.out.println("dort");

        } else {
            System.out.println("gecersiy sayi");
        }

    }
}