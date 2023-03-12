package gunler.gun25_cuma18;

public class TasKagitMakas {




    public static void main(String[] args) {


        // Return method kullanarak tas kagit makas oyununun kazananini belirleyen bir method yazin

        String sonuc = tasKayitMakas("Kagit","Kagit");
        String sonuc2 = tasKayitMakas("Kagit","Tas");
        String sonuc3 = tasKayitMakas("Kagit","Makas");
        String sonuc4 = tasKayitMakas("Makas","Kagit");
        String sonuc5 = tasKayitMakas("Tas","Kagit");
        String sonuc6 = tasKayitMakas("Makas","Tas");

        System.out.println("sonuc = " + sonuc3);
    }

    public static String tasKayitMakas(String oyuncu1,String oyuncu2){

        if(oyuncu1==oyuncu2){
            return "Beraberlik";
        }else if(oyuncu1 == "Kagit" && oyuncu2 != "Makas"){
            return "Kazanan 1. oyuncu";
        }else if(oyuncu1 == "Makas" && oyuncu2 != "Tas"){
            return "Kazanan 1. oyuncu";
        }else if(oyuncu1 == "Tas" && oyuncu2 != "Kagit"){
            return "Kazanan 1. oyuncu";
        }else{
            return "Kazanan 2. oyuncu";
        }
    }

}











