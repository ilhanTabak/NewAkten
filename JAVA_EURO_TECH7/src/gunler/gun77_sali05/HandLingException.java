package gunler.gun77_sali05;

public class HandLingException {
    public static void main(String[] args) {


        //handling exceprion with try catch block

        try {

            //try block
            //code throws exception

        } catch (Exception e) {//exceptoion class and referanc for the object

            //catch block
            //handling exception

        }

        try {


            System.out.println(1 / 0);
        } catch (Exception e) {


            System.out.println("can not divide zero");
        }


        System.out.println("star test");
        System.out.println("run test");
        System.out.println("calculation"+1/8);
        System.out.println("end test");

        try{
            System.out.println("calculation"+1/8);        }catch (Exception e){
            System.out.println("can not divided by zero");
        }
        System.out.println("end test");
    }

}