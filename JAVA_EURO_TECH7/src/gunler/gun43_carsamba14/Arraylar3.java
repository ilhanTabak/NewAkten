package gunler.gun43_carsamba14;

import java.util.Arrays;

public class Arraylar3 {


    public static void main(String[] args) {


        int[]sayilar={5,10,3,7,22,19,38,15};

        Arrays.toString(sayilar);
       Arrays.sort(sayilar);
        String str="Merhaba";
        str.concat("Java");
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,10));
        System.out.println(Arrays.stream(sayilar).sum());
        int[]sayilar2={1,2,3,4};
        int[]sayilar3={1,2,3,5};
        System.out.println(Arrays.equals(sayilar2,sayilar3));


    }
}
