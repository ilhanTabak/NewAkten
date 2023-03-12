package gunler.gun43_carsamba14;

import java.util.Arrays;

public class Arrayler {
    public static void main(String[] args) {


        String[] kulupler = {"Real Madrid", "Sporting Lisbon", "Werder Bremen", "Bayern Munih",};

        for (String sehir : kulupler) {

            String []takimlar=sehir.split(",");

            System.out.println(Arrays.toString(takimlar));

            for (String element:takimlar) {

                String[] takim=element.split(" ");


            }



        }


    }


        }



