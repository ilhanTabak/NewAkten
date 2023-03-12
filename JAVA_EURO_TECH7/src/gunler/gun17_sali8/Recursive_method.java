package gunler.gun17_sali8;



public class Recursive_method {


    public static void hesapla(double sayi) {


        double toplam = 0;



        for (int i = 1; i <= sayi; i++) {

            toplam = toplam + i;

        }

        System.out.println(toplam);

    }

    public static void main(String[] args) {


        hesapla(999.8);


    }


}
