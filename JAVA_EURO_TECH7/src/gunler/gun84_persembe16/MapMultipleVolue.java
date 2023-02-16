package gunler.gun84_persembe16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleVolue {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> aracMarkaModelListe = new HashMap<>();

        aracMarkaModelListe.put("Honda",new ArrayList<>());
        aracMarkaModelListe.get("Honda").add("Civic");
        aracMarkaModelListe.get("Honda").add("Accord");
        aracMarkaModelListe.get("Honda").add("Jazz");

        aracMarkaModelListe.put("Toyota", new ArrayList<>());
        aracMarkaModelListe.get("Toyota").add("Corolla");
        aracMarkaModelListe.get("Toyota").add("Avensis");
        aracMarkaModelListe.get("Toyota").add("Yaris");

        aracMarkaModelListe.put("Mercedes", new ArrayList<>());
        aracMarkaModelListe.get("Mercedes").add("E 250D");
        aracMarkaModelListe.get("Mercedes").add("A 180 XLS");
        aracMarkaModelListe.get("Mercedes").add("GLS 63");

        System.out.println("Araç marka ve modelleri : " + aracMarkaModelListe);

        System.out.println("Araç marka/modelleri");
        System.out.println("--------------------");
        for (Map.Entry<String,ArrayList<String>>  entry: aracMarkaModelListe.entrySet()){
            System.out.println(entry.getKey().toUpperCase());
            for (String eleman: aracMarkaModelListe.get(entry.getKey())){
                System.out.println("\t" + eleman);
            }
            //System.out.println(entry);
        }
        System.out.println();
        System.out.println("Verilen markanın modellerini listeler.");
        String marka;
        marka = "Honda";
        System.out.println(marka + " aracın modelleri");
        System.out.println("---------------------------");
        for (String eleman:aracMarkaModelListe.get(marka)){
            System.out.println(eleman);
        }
    }
}