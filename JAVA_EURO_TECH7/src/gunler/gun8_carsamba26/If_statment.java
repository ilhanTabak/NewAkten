package gunler.gun8_carsamba26;

import java.util.Scanner;

public class If_statment {
    public static void main(String[] args) {

        //if statment=performs a block of code if its condition evaluates to be true

        Scanner scan = new Scanner(System.in);

        System.out.println("yasiniz kac");

        int age=scan.nextInt();

        if (age >= 18) {
            System.out.println("Du bist alt");

        } else if (age <= 18) {
            System.out.println("Du bist jung");

        }
    }
}
