package gunler.gun58_persembe12;

public class HesapMachine {


    public static double sonuc;

    public static void topla(int a,int b){


        sonuc=a+b;
    }


    public static void topla(int...sayi){

        System.out.println(sayi.length);


    }

    public static void ogrenciEEkle(Ogrenci...oogrenci){


        for(Ogrenci eleman:oogrenci){

            System.out.println(eleman);




        }

    }

}
