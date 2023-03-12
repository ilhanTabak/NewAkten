package gunler.gun10_cuma28;

public class void_method {

    public static void main(String[] args) {

        /*Input olarak verilen satis fiyati,musteri karti var mi?
        ve uyeligi kac yillik ?bilgiloerini degerlendirip
        -uye degilse %5indirim
        -uyeligi var ama 5 yildan az ise %10 indirim
        -uyeligi var ve 5 yildan cok ise %15 indirim uygulayip
        asil fiyati indirim miktarini ve indirimli fiyati yazdiran bir method olustutun
        yukarida ki soruda benden sadece soerunu yazdirmami istiyor bu yuzden ben yukarida void
        kullanabilirim.

         */

        boolean uyeMi = false;
        int uyelikYili = 15;
        double satisFiyati = 250;

        indirimliFiyatHesapla(uyeMi, uyelikYili, satisFiyati);
    }

    public static void indirimliFiyatHesapla(boolean uyeMi, int uyelikYili, double satisFiyati) {

        if (uyeMi) {

            if (uyelikYili < 5) {
                System.out.println("Urun fiyati: " + satisFiyati);
                System.out.println("Indirim: " + satisFiyati * 0.10);
                System.out.println("Indirimli fiyat: " + (satisFiyati - satisFiyati * 0.10));

            } else {
                System.out.println("Urun fiyati: " + satisFiyati);
                System.out.println("Indirim: " + satisFiyati * 0.15);
                System.out.println("Indirimli fiyat: " + (satisFiyati - satisFiyati * 0.15));
            }


        } else {

            System.out.println("Urun fiyati: " + satisFiyati);
            System.out.println("Indirim: " + satisFiyati * 0.05);
            System.out.println("Indirimli fiyat: " + (satisFiyati - satisFiyati * 0.05));
        }

    }
}