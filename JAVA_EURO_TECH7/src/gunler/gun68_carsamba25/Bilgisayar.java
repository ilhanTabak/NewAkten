package gunler.gun68_carsamba25;

public class Bilgisayar {

    private AnaKart anakart;
    private Monitor monitor;
    private Kasa kasa;

    public Bilgisayar(AnaKart anakart, Monitor monitor, Kasa kasa) {
        this.anakart = anakart;
        this.monitor = monitor;
        this.kasa = kasa;
    }

    public AnaKart getAnakart() {
        return anakart;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Kasa getKasa() {
        return kasa;
    }

    @Override
    public String toString() {
        return "Bilgisayar{" +
                "anakart=" + anakart +
                ", monitor=" + monitor +
                ", kasa=" + kasa +
                '}';
    }
}
