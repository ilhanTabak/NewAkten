package gunler.gun54_cuma06;

import java.util.Arrays;

public class ArrayProblemleri {


    public static void main(String[] args) {


        int[] []sayilar1 = {{12,10,4},{2,20,30}};
        int[] []sayilar2 = {{20,10,4},{2,20,10}};
        int[] []sayilar3 = {{12,11,4},{2,20,31}};


         int sonuc=kedi(sayilar3);
        System.out.println(sonuc);



    }


    public static int kedi(int[][] deneme) {




         int max=0;
         int max2=0;



        for (int i = 0; i < deneme[0].length; i++) {


                if(deneme[0][i]>max&&deneme[0][i]%10==0){

                    max=deneme[0][i];

            }

        }

        for (int i = 0; i < deneme[1].length; i++) {


                if(deneme[1][i]>max2&&deneme[1][i]%10==0){

                    max2=deneme[1][i];

                }

            }

        return max+max2;

        }



    }
