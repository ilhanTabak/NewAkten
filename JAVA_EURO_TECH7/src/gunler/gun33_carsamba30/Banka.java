package gunler.gun33_carsamba30;

public class Banka {

    String hesapSahibi;
    long hesapNumarasi;
    double bakiye;
    static String bankaAdi = "EuroTechBank";


    public void paraYatir(double miktar){
        bakiye += miktar;
        System.out.println(hesapNumarasi + " nolu hesabiniza " + miktar + " TL miktarinda para yatirilmistir.");
    }

    public void paraCek(double miktar){
        if(miktar <= bakiye){
            bakiye -= miktar;
            System.out.println(hesapNumarasi + " nolu hesabinizdan " + miktar + " TL miktarinda para cekilmistir.");
        }else{
            System.out.println("Uzgunum hesabinizda yeterli bakiye bulunmamaktadir.");
        }
    }

    public void satinAl(String urunIsmi, double fiyat){
        if(fiyat <= bakiye){
            bakiye -= fiyat;
            System.out.println(urunIsmi + " isimli urun icin " + fiyat + " TL kadar odeme yapilmistir." );
        }else{
            System.out.println("Urun fiyati icin bakiyeniz yeterli degildir");
        }
    }

    public void bakiyeGoster(){
        System.out.println("-----------------");
        System.out.println("Banka Adi : " + bankaAdi);
        System.out.println("Hesap Sahibi : " + hesapSahibi);
        System.out.println("Hesap Numarasi : " + hesapNumarasi);
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("-----------------");
    }
}

