package gunler.gun44_persembe15;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTraining {

    public static void main(String[] args) {


        ArrayList<String>arr=new ArrayList<>();
       // ArrayList<String>arr1=new ArrayList<>();
        //arr1.add("Pink");

        arr.add("Red");
        arr.add("Green");
        arr.add("Orange");
        arr.add("White");
        arr.add("Black");

        //System.out.println(arr);

        String pink="Pink";

        //arr.set(0, pink);
        //System.out.println(arr);

        //arr1.addAll(arr);

        //System.out.println(arr1);

        arr.add(0,pink);
        System.out.println(arr);




    }
}
