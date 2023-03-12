package gunler.gun58_persembe12;

public class Ogrenci {

   static int okulNo=1000;
    private String adi;

    int ogrenciNo;
   final static String okulAdi="EurotechStudy";
    final static String okulAdresi="Germany";


    public Ogrenci(String adi) {
        okulNo++;
        this.ogrenciNo=okulNo;
        this.adi = adi;
        //this.okulAdi = okulAdi;
        //this.okulAdresi = okulAdresi;
    }


    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo" +ogrenciNo+
                ", adi='" + adi + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", okulAdresi='" + okulAdresi + '\'' +
                '}';
    }

    public String getAdi(){

        return adi;
    }
    public void setAdi(){
        this.adi=adi;

    }
}
