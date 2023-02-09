package gunler.gun78_carsamba08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileOps {

    public static void main(String[] args) {


        File file = new File("JAVA_EURO_TECH7/src/gunler/gun78_carsamba08/Data.txt");
        Scanner satirOku = null;
        int sayi;

        try {

            satirOku = new Scanner(file);
            System.out.println("ich habe gefunden");
            System.out.println(satirOku.nextLine());


        }

        catch (FileNotFoundException foundException){

            System.out.println("file gibt es nicht in dem System");

        }

        catch (NoSuchElementException nichtSetze){
            System.err.println("System kann nicht lesen");
        }
        catch (Exception exp) {


            exp.printStackTrace();
        }
        finally {
            System.out.println("ich bin finally block");
        }
    }

}