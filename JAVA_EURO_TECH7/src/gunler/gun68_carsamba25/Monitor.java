package gunler.gun68_carsamba25;

public class Monitor {



    private String model;
    private String ureticiFirma;
    private int ekranBoyutu;
    private Cozunurluk cozunurluk;


    public Monitor(String model, String ureticiFirma, int ekranBoyutu, Cozunurluk cozunurluk) {
        this.model = model;
        this.ureticiFirma = ureticiFirma;
        this.ekranBoyutu = ekranBoyutu;
        this.cozunurluk = cozunurluk;
    }


    public String getModel() {
        return model;
    }

    public String getUreticiFirma() {
        return ureticiFirma;
    }

    public int getEkranBoyutu() {
        return ekranBoyutu;
    }

    public Cozunurluk getCozunurluk() {
        return cozunurluk;
    }
}
