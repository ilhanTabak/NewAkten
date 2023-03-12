package gunler.gun51_sali03;

import java.util.ArrayList;

public class Banka {

    String adi;
    String adresi;
    int hesapNo=1000;

    public Banka() {
    }

    ArrayList <Musteri>musteriler=new ArrayList<>();

    public Banka(String adi, String adresi) {
        this.adi = adi;
        this.adresi = adresi;
    }

    public void musteriEkle(Musteri Kunden){
        this.hesapNo++;
        Kunden.hesapNo=this.hesapNo;
        this.musteriler.add(Kunden);

        System.out.println(Kunden.hesapNo+"hesap nolu"+Kunden.adi+"isimli");

    }

    public void showInfo(){

        System.out.println("Bankamizdaki musterilerin bilgileri asagidadir");
        System.out.println("----------------------------------------------");
        System.out.println("Bankanin adi:"+this.adi);
        System.out.println("Bankanin adresi:"+this.adresi);

        for (Musteri musteri:this.musteriler) {

           musteri.showInfo();

        }



    }


}
