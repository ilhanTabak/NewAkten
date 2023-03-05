package gunler.gun82_sali14;



    import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

    public class LoopingMap {

        public static void main(String[] args) {

            Map<String,String> capitalCities = new LinkedHashMap<>();
            capitalCities.put("England" , "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("France", "Paris");
            capitalCities.put("Russia", "Moscow");
            capitalCities.put("Turkiye", "Ankara");

            // Get list of keys
            System.out.println(capitalCities.keySet());

            // Get list of values
            System.out.println(capitalCities.values());

            System.out.println("Printing keys....");

            for(String country : capitalCities.keySet()){
                System.out.print(country + " | ");
            }

            System.out.println();
            System.out.println("Printing values....");

            for(String city : capitalCities.values()){
                System.out.print(city + " | ");
            }

            System.out.println();

            Set<String> countries = capitalCities.keySet();
            for (String country : countries){
                System.out.print(country + " | ");
            }

            System.out.println();

            Collection<String> cities = capitalCities.values();
            for(String city : cities){
                System.out.print(city + " | ");
            }

            System.out.println();

            // How to print keys and values in same iteration

            for(String country : capitalCities.keySet()){
                System.out.println(country + " | " + capitalCities.get(country));
            }

            System.out.println();

            // 2. way
            for(Map.Entry<String,String> capitals : capitalCities.entrySet()){
                System.out.println(capitals.getKey() + " | " + capitals.getValue());
            }

        }
    }



