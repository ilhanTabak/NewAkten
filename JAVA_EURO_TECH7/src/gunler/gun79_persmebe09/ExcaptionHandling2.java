package gunler.gun79_persmebe09;

import java.util.Scanner;

public class ExcaptionHandling2 {

    public static void main(String[] args) {


        System.out.println("Program beginnt");

        int a=0,b;
        int[]arr=new int[3];
        Scanner scan=new Scanner(System.in);


        try{
            a=2/1;
            System.out.println("in dem try");
            //System.out.println(a);
            arr[0]=10;
            b=scan.nextInt();

        }catch (ArithmeticException e){

            System.out.println("Arithmetic Exception fehler!");
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e){


            System.out.println("Array bound fehler");
            System.out.println(e.getMessage());
        }catch(Exception e){

            System.out.println("gibt es ein Fehler");
            System.out.println(e.toString());

        }
        System.out.println("program beendet");




    }



}
