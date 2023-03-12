package gunler.gun63_persembe19;

public class ReplitCozumleri {

    public static void main(String[] args) {


        String dede="kuyular";
        int gaga=5;

     String abc=kedi(dede,gaga);

        System.out.println(abc);

    }




    public static String kedi(String deneme,int indexNo){


        String sonuc="";


        sonuc=deneme.substring(0,indexNo);
        return sonuc;








    }
}
