package gunler.gun3_carsamba19;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays_2d_dersi {

    public static void main(String[] args) {


        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();


        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("pasta");
        bakeryList.add("pogaca");
        bakeryList.add("tatli");
        bakeryList.add("simit");

        ArrayList<String> productList = new ArrayList<>();


        productList.add("domates");
        productList.add("salatalik");
        productList.add("kasar");
        productList.add("un");


        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("kola");
        drinkList.add("fanta");
        drinkList.add("ayran");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);


        System.out.println(groceryList.get(2).get(2));


    }
}
