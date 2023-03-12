package gunler.gun47_sali20;

import java.util.Arrays;

public class ArrayCalisma {


    public static void main(String[] args) {


        int[][] not=new int[2][4];

        not[0][0]=10;
        not[0][1]=15;
        not[0][2]=20;
        not[0][3]=25;
        not[1][0]=30;
        not[1][1]=35;
        not[1][2]=40;
        not[1][3]=45;

        int[][] not2=new int[2][4];

        not2[0][0]=100;
        not2[0][1]=150;
        not2[0][2]=200;
        not2[0][3]=250;
        not2[1][0]=300;
        not2[1][1]=350;
        not2[1][2]=400;
        not2[1][3]=450;

        //System.out.println(Arrays.deepToString(not));

       int [][][]butun=new int[2][2][4];

       butun[0]=not;
       butun[1]=not2;
        //System.out.println(Arrays.deepToString(butun));

        for (int i = 0; i <butun.length ; i++) {

            for (int j = 0; j <butun[i].length ; j++) {

                for (int k = 0; k <butun[i][j].length ; k++) {

                    System.out.print(" "+butun[i][j][k]);

                }



            }

        }



    }
}
