package gunler.gun68_carsamba25;

public class Kasa {

    private String model;
    private String ureticiFirma;
    private String gucKaynagi;
    private Boyut boyut;


    public Kasa(String model, String ureticiFirma, String gucKaynagi, Boyut boyut) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.gucKaynagi = gucKaynagi;
        this.boyut = boyut;
    }

    public void calistir(){

        System.out.println("Bilgisayar baslatildi");
    }

    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public String getGucKaynagi() {
        return gucKaynagi;
    }

    public Boyut getBoyut() {
        return boyut;
    }
}
