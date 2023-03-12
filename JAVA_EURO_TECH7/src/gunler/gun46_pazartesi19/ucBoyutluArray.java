package gunler.gun46_pazartesi19;

import java.util.Arrays;

public class ucBoyutluArray {


    public static void main(String[] args) {

     String[][]sehirler={

             {"Istanbul","Edirne","Erzurum","Mus","Adana"},
             {"Berlin","Munih","Bremen","Hamburg"},
             {"Londra","Manchester","Leeds"}

     };
        System.out.println(sehirler[0].length);

        System.out.println("Arrays.toString(sehirler[2]) = " + Arrays.toString(sehirler[2]));


        for (int i=0;i<sehirler.length;i++){

            for (int j = 0; j <sehirler[i].length ; j++) {


                System.out.print( " "+sehirler[i][j]);

            }
            System.out.println();


        }
              {

        }


    }














        }





