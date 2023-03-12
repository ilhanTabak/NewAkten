package gunler.gun52_carsamba04;

public class Cow {

    String adi;
    String rengi;
    int agirligi;
    static int hayvanSayisi;


    public Cow(String adi, String rengi, int agirligi) {

        hayvanSayisi++;
        this.adi = adi;
        this.rengi = rengi;
        this.agirligi = agirligi;
    }


    @Override
    public String toString() {
        return "Cow{" +
                "adi='" + adi + '\'' +
                ", rengi='" + rengi + '\'' +
                ", agirligi=" + agirligi +
                '}';
    }
}
