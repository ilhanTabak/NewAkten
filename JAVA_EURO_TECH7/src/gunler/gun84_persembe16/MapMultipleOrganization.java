package gunler.gun84_persembe16;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapMultipleOrganization {


    public static void main(String[] args) {


        Map<String, ArrayList<String>> autoModelList=new HashMap<>();

        autoModelList.put("Honda",new ArrayList<>());

        autoModelList.get("Honda").add("Civic");
        autoModelList.get("Honda").add("Jazz");
        autoModelList.get("Honda").add("Punto");

        autoModelList.put("Toyota",new ArrayList<>());

        autoModelList.get("Toyota").add("Corolla");
        autoModelList.get("Toyota").add("Yaris");
        autoModelList.get("Toyota").add("Avensis");



        for(Map.Entry<String,ArrayList<String>> entry:autoModelList.entrySet()){

            System.out.println(entry);
        }



    }





    }
