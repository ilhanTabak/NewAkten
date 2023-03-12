package gunler.gun54_cuma06;

import java.util.ArrayList;

public class EquelsMethod {


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

        months.add("junn");

        if(months.equals(list1)){

            System.out.println("eslesti");

        }else{

            System.out.println("eslesmedi");

        }


    }
}
