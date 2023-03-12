package gunler.gun68_carsamba25;

public class BilgisayarTestClass {


    public static void main(String[] args) {

        Boyut boyut=new Boyut(35.5,15.3,20.8);
        Kasa kasa=new Kasa("nirvana","dell","elektrik",boyut);
        Monitor monitor=new Monitor("5500","lg",23,new Cozunurluk(1920,1080));
        AnaKart anakart=new AnaKart("5345","intel",4,2,"vfg");

        Bilgisayar bilgisayar=new Bilgisayar(anakart,monitor,kasa);

        bilgisayar.getKasa().calistir();
        System.out.println(bilgisayar.getMonitor().getEkranBoyutu());


    }
}
