package gunler.gun51_sali03;

public class BankaProgrami {

    public static void main(String[] args) {

        Musteri musteri1=new Musteri();
        musteri1.showInfo();

        Musteri musteri2=new Musteri("ahmet",1234567);
        musteri2.showInfo();

        Musteri musteri3=new Musteri("ahmet",123567788,3456,0533455,1000.0);
        musteri3.showInfo();

        Banka banka=new Banka("abc","aydin");







    }
}
