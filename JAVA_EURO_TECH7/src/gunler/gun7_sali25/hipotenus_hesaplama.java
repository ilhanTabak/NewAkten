package gunler.gun7_sali25;

import java.util.Scanner;

public class hipotenus_hesaplama {
    public static void main(String[] args) {


        double x;
        double y;
        double z;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter x: ");
        x = scan.nextDouble();
        System.out.println("enter y: ");

        y=scan.nextDouble();
        z=Math.sqrt((x*x)+(y*y));

        System.out.println("the hypotenuse is: "+z);

    }
}
