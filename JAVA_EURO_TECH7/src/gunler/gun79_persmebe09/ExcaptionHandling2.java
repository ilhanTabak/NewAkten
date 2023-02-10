package gunler.gun79_persmebe09;

public class ExcaptionHandling2 {

    public static void main(String[] args) {


        System.out.println("Program beginnt");

        int a=0;

        try{
            a=2/0;
            System.out.println("in dem try");
            System.out.println(a);

        }catch (ArithmeticException e){


            System.out.println(e.getMessage());

        }
        System.out.println("program beendet");




    }



}
