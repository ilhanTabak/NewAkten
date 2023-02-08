package gunler.gun78_carsamba08;

public class SplitMethod {

    public static void main(String[] args) {


        String sample="I love you";

        String sample2=cat(sample);

        System.out.println(sample2);


    }


    public static String cat(String exp){

        String bbb="";
       String[]abc = exp.split(" ");


        for (int i = 0; i < abc.length ; i++) {

            for (int j =abc[i].length()-1;j>=0 ; j--) {

                bbb=bbb+abc[i].charAt(j);

            }

            bbb=bbb+" ";
        }




        return bbb;



    }



}
