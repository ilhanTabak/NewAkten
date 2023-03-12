package gunler.gun53_persembe05;

public class Urun {

    String urunAdi;
    double birimFiyati;
    double miktar;
    String kategori;
    double toplamFiyat;

    public Urun(String urunAdi, double birimFiyati, double miktar, String kategori) {
        this.urunAdi = urunAdi;
        this.birimFiyati = birimFiyati;
        this.miktar = miktar;
        this.kategori = kategori;
    }


    public double getToplamFiyat() {
        this.toplamFiyat = birimFiyati * miktar;
        return toplamFiyat;

    }

    public String toString() {

        String str = "";
        str += urunAdi + " " + birimFiyati + " " + miktar + " " + getToplamFiyat();

        return str;


    }

    public static void main(String[] args) {
        Urun urun1=new Urun("elme",15,3,"yiyecek");

        System.out.println(urun1);
    }

}
