package gunler.gun50_pazartesi02;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<String> nameList=new ArrayList<>();

       nameList.add("Ahmet");
       nameList.add("Ayse");
       nameList.add("Hasan");
       nameList.add("Emine");

       ArrayList<Integer> numbers=new ArrayList<>();

       numbers.add(99);
       numbers.add(25);
       numbers.add(50);
       numbers.add(63);
       numbers.add(new Integer("45"));

       Integer num=new Integer("68");
       numbers.add(num);

       Integer num2=35;
       numbers.add(num2);


        System.out.println(nameList.toString());
        System.out.println(numbers.toString());
        System.out.println(nameList);
        System.out.println(numbers);







    }
}
