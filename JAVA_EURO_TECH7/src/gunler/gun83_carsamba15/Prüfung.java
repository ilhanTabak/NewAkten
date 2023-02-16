package gunler.gun83_carsamba15;


import java.util.ArrayList;

public class Prüfung {


    public static void main(String[] args) {

        ArrayList<String>arr=new ArrayList<>();
        ArrayList<String>arr2=new ArrayList<>();

        arr.add("Red");
        arr.add("Green");
        arr.add("Black");
        arr.add("White");
        arr.add("Pink");

        arr2.add("Red");
        arr2.add("Green");
        arr2.add("Black");
        arr2.add("Pink");


        System.out.println(arr.subList(0, 3));

    }

}


