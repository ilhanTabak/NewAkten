package gunler.gun82_sali14;

    import java.util.*;

    public class MapValueTypes {

        public static void main(String[] args) {

            // <Key, Object>
            Map<Integer, String> map1 = new HashMap<>();
            map1.put(1,"john");
            map1.put(2,"jane");
            map1.put(3,"jim");
            System.out.println("map1 = " + map1);

            // <Key, Array Object>
            Map<String, String[]> map2 = new HashMap<>();
            String[] arr1 = {"John", "Jane"};
            String[] arr2 = {"Bob", "Jim"};
            map2.put("Family1",arr1);
            map2.put("Family2", arr2);
            System.out.println("map2 = " + map2);

            // <Key, Collection Object>
            Map<Integer, List<String>> map3 = new HashMap<>();
            List<String> list1 = Arrays.asList("John", "Jane");
            List<String> list2 = Arrays.asList("Bob", "Jim");
            map3.put(1,list1);
            map3.put(2,list2);
            System.out.println("map3 = " + map3);

            // <Key, Map Object>
            Map<String, Map<Integer,String>> map4 = new HashMap<>();
            Map<Integer,String> friends1 = new HashMap<>();
            friends1.put(1,"John");
            friends1.put(2,"Jane");
            Map<Integer, String> friends2 = new HashMap<>();
            friends2.put(1,"Bob");
            friends2.put(2,"Jim");
            map4.put("A", friends1);
            map4.put("B", friends2);
            System.out.println("map4 = " + map4);

            // <Key, Template Class>
            Map<String, Animal> map5 = new HashMap<>();
            Animal dog = new Animal("dog",4);
            Animal duck = new Animal("duck", 2);
            map5.put("dog", dog);
            map5.put("duck", duck);
            System.out.println("map5 = " + map5);

            // Map<List<String>>, String> map6 = new HashMap<>();

        }
    }

    class Animal{

        String name;
        int legs;

        public Animal(String name, int legs) {
            this.name = name;
            this.legs = legs;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", legs=" + legs +
                    '}';
        }
    }



