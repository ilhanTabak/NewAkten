package gunler.gun51_sali03;

import java.util.ArrayList;

public class Okul {

    String okulAdi;
    String okulAdresi;

    int ogrenciSayisi;


    ArrayList<Ögrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAdi, String okulAdresi) {
        this.okulAdi = okulAdi;
        this.okulAdresi = okulAdresi;

    }


    public void ogrenciEkle(Ögrenci talebe) {

        this.ogrenciSayisi++;
        talebe.ogrenciSayisi = this.ogrenciSayisi;
        this.ogrenciler.add(talebe);

        System.out.println(talebe.ogrenciSayisi + "nolu" + talebe.ogrenciAdi + "isimli");


    }

    public void ogrenciBilgileri(){

        System.out.println("Ogrenci bilgileri asagidadir");
        System.out.println("----------------------------------------------");
        System.out.println("Okul adi:" + this.okulAdi);
        System.out.println("Okul adresi:" + this.okulAdresi);

        for (Ögrenci yeniOgrenci : this.ogrenciler) {

            yeniOgrenci.ogrenciBilgileri();




        }
    }
}