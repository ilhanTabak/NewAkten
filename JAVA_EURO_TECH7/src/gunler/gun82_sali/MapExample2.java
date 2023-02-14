package gunler.gun82_sali;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {

    public static void main(String[] args) {

        Map<String,Double> items = new HashMap<String,Double>();
        items.put("Apple", 5.3);
        items.put("Orange", 6.5);
        items.put("Banana", 8.5);
        items.put("Cherry", 9.0);

        System.out.println("items = " + items);

        System.out.println(items.isEmpty());

        // key must be unique in map
        // when duplicated key is provided in put()
        // Java understands it needs to be updated
        items.put("Apple", 7.4);
        System.out.println("items = " + items);

        items.remove("Apple");
        System.out.println(items.size());
        System.out.println("items = " + items);

        System.out.println(items.putIfAbsent("Banana", 7.9));
        System.out.println("items = " + items);

        System.out.println(items.putIfAbsent("Berry", 4.3));
        System.out.println("items = " + items);

        System.out.println("Apple in the list? " + items.containsKey("Apple"));
        System.out.println("Orange in the list? " + items.containsKey("Orange"));

        System.out.println("Any item in the list? " + items.containsValue(2.5));
        System.out.println("Any item in the list? " + items.containsValue(6.5));

        System.out.println(items.get("Orange") + 4.5);
    }
}