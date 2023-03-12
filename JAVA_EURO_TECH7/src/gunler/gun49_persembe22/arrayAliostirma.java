package gunler.gun49_persembe22;

import java.util.Arrays;

public class arrayAliostirma {

    public static void main(String[] args) {

        int[] abc = {2, 3,4, 8};
        int[] bca = {3, 3,4, 6};
        int[] cde = {8, 1,4,7};


        int[]yeni=kedi(abc);
        System.out.println(Arrays.toString(yeni));

    }
       public static int[] kedi(int[]deneme) {
        int k=0;

        k=deneme[0];
        deneme[0]=deneme[deneme.length-1];
        deneme[deneme.length-1]=k;

        return deneme;




       }

       }


