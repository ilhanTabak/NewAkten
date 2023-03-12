package gunler.gun53_persembe05;

import java.util.ArrayList;

public class Sepet {

    ArrayList<Urun>urunler=new ArrayList<>();
    double urunlerToplamFiyat;

    Sepet(){

        this.urunler=new ArrayList<>();


    }
public void sepeteEkle(Urun urun){

        this.urunler.add(urun);

}


public double sepetToplamFiyat(){

    for (Urun urun:this.urunler) {

        this.urunlerToplamFiyat+=urun.getToplamFiyat();

    }

        return urunlerToplamFiyat;

}


public String toString(){


        String str="";

        str+="Sr    Urunun adi     Birim Fiyati.   Miktari       Toplam Fiyati    Kategori\n";
        str+="---   ----------     ------------    -------        -------------   ------------\n";
        int srNo=1;
        for(Urun urun:urunler){

            str += srNo++ +"-\t"+urun;

        }

        str+="\n                           Urunlerin toplam fiyat="+sepetToplamFiyat();

        return str;





}






}
