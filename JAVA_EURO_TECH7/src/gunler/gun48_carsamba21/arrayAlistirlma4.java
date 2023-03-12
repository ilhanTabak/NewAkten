package gunler.gun48_carsamba21;

import java.util.Arrays;

public class arrayAlistirlma4 {


    public static void main(String[] args) {

        int[] ali={1,2,3,4,5};





        System.out.println(Arrays.toString(abc(ali)));



    }


    public static int[] abc(int[] numune) {


        int[] numune2 = new int[2];

        for (int i = 0; i < numune.length; i++) {

            for (int j = 0; j < i; j++) {

                numune2[0] = numune[0];
                numune2[1] = numune[numune.length - 1];


            }





        }

        return numune2;
    }

}