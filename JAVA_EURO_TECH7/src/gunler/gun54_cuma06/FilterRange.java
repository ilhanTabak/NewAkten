package gunler.gun54_cuma06;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterRange {

    public static void main(String[] args) {



        ArrayList<Integer> sonuc=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,12,13,14));

        ArrayList<Integer>sonuc2=sayilar(sonuc,5,10);
        System.out.println(sonuc2.toString());

        }


        public static ArrayList sayilar(ArrayList<Integer> deneme,int num1,int num2){

        ArrayList<Integer>deneme2=new ArrayList<>();

            for (int i = 0; i <deneme.size(); i++) {

                if(deneme.get(i)<num1||deneme.get(i)>num2){

                    deneme2.add(deneme.get(i));
                }

            }



        return deneme2;

    }


}
