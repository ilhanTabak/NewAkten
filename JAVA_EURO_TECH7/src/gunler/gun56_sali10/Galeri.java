package gunler.gun56_sali10;

import java.util.ArrayList;

public class Galeri {

    static String name;
   static String adress;

   static ArrayList<Araba>arabalar=new ArrayList<>();




   static {

       name="ABC araba galerisi";
       adress="Falanca yerdeki adres";


       Araba araba1=new Araba("toyota","corolla");
       arabalar.add(araba1);
       arabalar.add(new Araba("honda","accord"));
       arabalar.add(new Araba("honda","civic"));
       arabalar.add(new Araba("toyota","corolla"));
       arabalar.add(new Araba("honda","Jazz"));
       arabalar.add(new Araba("ford","ee500"));
       arabalar.add(new Araba("honda","taunus"));
       arabalar.add(new Araba("ford","focus"));
       arabalar.add(new Araba("WV","accord"));

   }
   public static void listaByMarka(String marka){

       for (Araba araba:arabalar){

           if(araba.marka.equals(marka)){
               System.out.println(araba.marka);
               System.out.println(araba.model);




           }




       }






   }
    public static void main(String[] args) {


        System.out.println("Galeri.name = " + Galeri.name);
        System.out.println("Galeri.adress = " + Galeri.adress);

         Galeri.arabalar.add(new Araba("tofas","sahin"));

        for (Araba araba:Galeri.arabalar) {


            System.out.print(araba.marka+" ");
            System.out.println(araba.model);


            listaByMarka("Honda");

        }

    }




}
