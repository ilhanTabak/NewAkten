package gunler.gun50_pazartesi02;

import java.util.ArrayList;

public class ArrayList4 {


    public static void main(String[] args) {


        ArrayList<String> carList=new ArrayList<>();

        carList.add("Ferrari");
        carList.add("BMW");
        carList.add("Mercedes");

        System.out.println(carList.toString());

        carList.set(1,"Opel");

        System.out.println(carList.toString());



        ArrayList<String> cities=new ArrayList<>();

        cities.add("London");
        cities.add("Berlin");
        cities.add("Moskow");
        cities.add("New York");
        cities.add("Istanbul");
        cities.add("Amsterdam");
        cities.add("Paris");

        for (int i = 0; i <cities.size() ; i++) {


            System.out.println(cities.get(i));


            for (String city:cities) {

                System.out.println(city);

            }

        }

        cities.remove("Moskow");
        System.out.println(cities.toString());

        cities.set(2,"california");

        System.out.println(cities.toString());

        cities.add(2,"new jersey");

        System.out.println(cities.toString());





    }
}
