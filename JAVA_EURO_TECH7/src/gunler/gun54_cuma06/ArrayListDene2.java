package gunler.gun54_cuma06;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDene2 {


    public static void main(String[] args) {


        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(45, 74, 28, 98, 3, 56, 887, 12, 2, 46));



        System.out.println(kucukSayi(sayilar).toString());

    }


    public static ArrayList kucukSayi(ArrayList<Integer> deneme) {

        int enkucuk =-1;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < deneme.size(); i++) {


            if (deneme.get(i) < min) {

                min = deneme.get(i);

                enkucuk=i;


            }



        }
        deneme.remove(enkucuk);

        deneme.add(0,min);



        return deneme;
    }
}