package gunler.gun50_pazartesi02;

import java.util.ArrayList;

public class aArrayList3 {

    public static void main(String[] args) {


        ArrayList<Integer> nums=new ArrayList<>();

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);

        nums.add(1);
        nums.add(34);
        nums.add(56);
        nums.add(75);
        nums.add(54);
        nums.add(86);
        nums.add(85);

        System.out.println(nums.size());
        System.out.println(nums.isEmpty());
        System.out.println(nums.size()==0);

        System.out.println(nums.toString());

        nums.remove(5);
        System.out.println(nums.toString());

        Integer num=new Integer(95);

        nums.remove(num);








    }
}
