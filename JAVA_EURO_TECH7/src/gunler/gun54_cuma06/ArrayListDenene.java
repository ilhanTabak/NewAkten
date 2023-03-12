package gunler.gun54_cuma06;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDenene {


    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>(Arrays.asList("Ahmet","can","Semih","Cem","Kaan","Tom","Max","tim","Michael"));

        ArrayList<String> sonuc=karakter(names);
        System.out.println(sonuc.toString());


    }

    public static ArrayList karakter(ArrayList<String> deneme){

        for (int i = 0; i <deneme.size() ; i++) {

            if(deneme.get(i).length()==3) {
                deneme.add(deneme.get(i) + "***");
            }
        }

        return deneme;

    }





}
