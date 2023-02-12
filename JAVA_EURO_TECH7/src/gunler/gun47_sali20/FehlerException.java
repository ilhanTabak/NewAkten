package gunler.gun47_sali20;

import java.util.Scanner;

public class FehlerException {

    public static void main(String[] args) throws AgeException {


        Scanner scan= new Scanner(System.in);

        int age=0;

        boolean devam=true;
        while (devam){

            System.out.println("bitte geben Sie Ihre Alte ein.");
            age=Integer.parseInt(scan.nextLine());

            try{

                if(age<18){

                    throw new AgeException("Ihre Alte nicht genüg um dieses Auto zu fahren");

                }else{

                    devam=false;

                    System.out.println("Sie konnen Auto FAhren");



                }

            }catch (AgeException yasExc){
                System.out.println("catch block");

                System.out.println(yasExc.getMessage());


            }




        }

    }

}
