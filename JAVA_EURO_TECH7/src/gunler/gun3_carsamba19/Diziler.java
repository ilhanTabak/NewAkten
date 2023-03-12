package gunler.gun3_carsamba19;

public class Diziler {


    public static void main(String[] args) {


        int[] sayilar={1,5,8,7,9};
        String []isimler={"ali","veli"};


        for (int i = 0; i < sayilar.length ; i++) {


            System.out.println(sayilar[i]);

        }

        for (int j = 0; j <isimler.length ; j++) {

            System.out.println(isimler[j]);

        }

         for(int sayi:sayilar){

             System.out.println(sayi);
         }

         for(String isim:isimler){

             System.out.println(isim);
         }



    }
}
