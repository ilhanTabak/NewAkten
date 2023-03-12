package gunler.gun51_sali03;

public class Musteri {


//data members-----veri saklayan degiskenler

    String adi;
    int hesapNo;
    int kimlikNo;
    int telefonNo;
    double bakiye;


    public Musteri() {
    }

    public Musteri(String adi, int kimlikNo) {
        this.adi = adi;
        this.kimlikNo = kimlikNo;
    }


    public Musteri(String adi, int hesapNo, int kimlikNo, int telefonNo, double bakiye) {
        this.adi = adi;
        this.hesapNo = hesapNo;
        this.kimlikNo = kimlikNo;
        this.telefonNo = telefonNo;
        this.bakiye = bakiye;
    }


    public void showInfo(){


        System.out.println("*****Musteri Bilgileri***");
        System.out.println("-------------------------");
        System.out.println("Musteri adi           :"+this.adi);
        System.out.println("Mussterinin kimlik no:"+this.kimlikNo);
        System.out.println("Musterinin hesap no:"+this.hesapNo);
        System.out.println("Musterinin telefonu:"+this.telefonNo);
        System.out.println("Musterinin hesab bakiyesi:"+this.bakiye);

    }
}
