package gunler.gun84_persembe16;

import java.util.HashMap;
import java.util.Map;

public class MapClassExample {


    public static void main(String[] args) {


        Map<Integer,PersonKisi> persons=new HashMap<>();

        PersonKisi personKisi=new PersonKisi(123456," Ahmet "," istanbul ");

        persons.put(personKisi.getTCNO(),personKisi);

        personKisi=new PersonKisi(124578," John "," Colorado ");


        persons.put(personKisi.getTCNO(),personKisi);
        System.out.println(persons);

        System.out.println("TCNO=123456"+persons.get(123456));

        System.out.println("Map listesinde ki kayit sayisi : "+persons.size());

        for(Map.Entry<Integer,PersonKisi>kisiEntry:persons.entrySet()){


            System.out.println("------------------------------------------");

            System.out.println("TCNO= "+kisiEntry.getKey());
            System.out.println("Adi"+kisiEntry.getValue().getName());
            System.out.println("Adresse"+kisiEntry.getValue().getAdresse());


        }




    }
}
