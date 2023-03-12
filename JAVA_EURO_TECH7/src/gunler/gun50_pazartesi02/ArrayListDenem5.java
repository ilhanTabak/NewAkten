package gunler.gun50_pazartesi02;

import java.util.ArrayList;

public class ArrayListDenem5 {


    public static void main(String[] args) {

        ArrayList<Integer>sayilar=new ArrayList<>();
        sayilar.add(12);
        sayilar.add(23);
        sayilar.add(34);



        for (Integer kedi:sayilar) {


            System.out.print(kedi+" ");

        }


        ArrayList<Integer>rakamlar=new ArrayList<>();

        rakamlar=sayilar;

        System.out.println(rakamlar);


        ArrayList<Integer> points=new ArrayList<>(rakamlar);

        System.out.println(points);

        System.out.println(points.contains(34));
        System.out.println(points.contains(88));
    }
}
