package gunler.gun44_persembe15;

import java.util.ArrayList;

public class ArrayListRemoveMethod {


    public static void main(String[] args) {


        ArrayList<String> array = new ArrayList<>();
        ArrayList<String>array2=new ArrayList<>();

        array.add("Red");
        array.add("Blue");
        array.add("Green");
        array.add("Black");
        System.out.println(array);


        array.set(2,"Yellow");

        System.out.println(array);

        //gibt es ein Element in diesem ArrayList?

        System.out.println(array.contains("Red"));


        //System.out.println(array.subList(0, 3));


        for (int i=0;i<3;i++){

            array2.add(array.get(i));


        }
        System.out.println(array2);




    }


}