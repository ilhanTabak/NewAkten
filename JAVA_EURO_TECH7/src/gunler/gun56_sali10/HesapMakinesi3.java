package gunler.gun56_sali10;

public class HesapMakinesi3 {

   public static double sonuc;


    public static void topla(int sayiA,int sayiB){

        sonuc=sayiA+sayiB;

    }

     public static void topla(int ...sayi){//var args


         System.out.println(sayi.length);

         for (int i = 0; i <sayi.length ; i++) {

             sonuc=sonuc+sayi[i];


         }

         System.out.println(sonuc);



     }



}
