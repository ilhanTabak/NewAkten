package gunler.gun44_persembe15;

import java.util.ArrayList;

public class ArrayListeContains {

    public static void main(String[] args) {


        ArrayList<String>array1=new ArrayList<>();
        ArrayList<String>array2=new ArrayList<>();
        ArrayList<String>array3=new ArrayList<>();


        array1.add("Red");
        array1.add("Green");
        array1.add("Black");
        array1.add("White");
        array1.add("Pink");

        array2.add("Red");
        array2.add("Green");
        array2.add("Black");
        array2.add("Pink");


        for (int i = 0; i <array1.size() ; i++) {

            if(array2.contains(array1.get(i))){


                array3.add(array1.get(i));



            }

        }

        System.out.println(array3);



        array1.addAll(array2);
        System.out.println(array1);


    }
}
