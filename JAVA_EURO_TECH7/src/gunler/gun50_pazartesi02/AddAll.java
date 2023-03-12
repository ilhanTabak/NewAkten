package gunler.gun50_pazartesi02;

import java.util.ArrayList;
import java.util.Arrays;

public class AddAll {

    public static void main(String[] args) {


        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");

        System.out.println(list1.toString());

        ArrayList<String> list2 = list1;
        System.out.println(list2.toString());

        ArrayList<String> months = new ArrayList<>(list2);
        System.out.println(months.toString());

        System.out.println(months.contains("Jan"));
        System.out.println(months.contains("Dec"));

        // How to check an object exist in specific index
        System.out.println(months.get(2) == "Mar");
        System.out.println(months.get(2).equals("Mar"));
        System.out.println(months.indexOf("Mar") == 2);

        if(months.containsAll(list1)){
            System.out.println("List1 exists in Months");
        }else{
            System.out.println("List1 does not exist in Months");
        }

        // Tek satirda ArrayList olusturma yontemi
        ArrayList<String> newList = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        System.out.println(newList.toString());
    }
}