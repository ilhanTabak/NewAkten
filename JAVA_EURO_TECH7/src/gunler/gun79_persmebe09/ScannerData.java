package gunler.gun79_persmebe09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerData {
    public static void main(String[] args) throws FileNotFoundException {


    File file=new File("JAVA_EURO_TECH7/src/gunler/gun79_persmebe09/Data.txt");

    Scanner satiroku=new Scanner(file);

        System.out.println(satiroku.nextLine());
        System.out.println(satiroku.nextLine());
        System.out.println(satiroku.nextLine());
        System.out.println(satiroku.nextLine());
        System.out.println(satiroku.nextLine());




    }
}
