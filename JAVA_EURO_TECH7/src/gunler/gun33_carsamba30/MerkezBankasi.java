package gunler.gun33_carsamba30;

public class MerkezBankasi {

    public static void main(String[] args) {

        Banka musteri = new Banka();

        musteri.hesapSahibi = "Ali Ates";
        musteri.hesapNumarasi = 2348792807923l;

        System.out.println(musteri.bakiye);
        System.out.println(musteri.bankaAdi);

        musteri.paraYatir(25000.00);

        musteri.paraCek(12000.00);

        musteri.paraCek(20000.00);

        musteri.satinAl("Iphone", 1000);

        musteri.bakiyeGoster();

        musteri.satinAl("BMW", 30000);

        musteri.paraCek(123);

        musteri.bakiyeGoster();

        System.out.println("---------------");

        Banka musteri2 = new Banka();

        musteri2.hesapSahibi = "Ayse Hanim";
        musteri2.hesapNumarasi = 432879792342l;

        musteri2.paraYatir(50000);

        musteri2.paraCek(2000);

        musteri2.satinAl("Ayakkabi", 2500);

        musteri2.bakiyeGoster();

        musteri2.bankaAdi = "Bank Of England";

        musteri.bakiyeGoster();
        musteri2.bakiyeGoster();


    }
}