package gunler.gun56_sali10;

public class Ogrenci {


    String adi;
   static int okulNo=1000;

   int ogrNo;
   final static String okulAdi="EuroTech Study";
   final static String okulAdresi="Germany";



    public Ogrenci(String adi) {
        okulNo++;

        this.ogrNo=okulNo;
        this.adi = adi;
        this.okulNo = okulNo;
        //this.okulAdi = okulAdi;
        //this.okulAdresi = okulAdresi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "adi='" + adi + '\'' +
                ", okulNo=" + ogrNo +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }
}
