package gunler.gun51_sali03;

public class Ögrenci {

    public int ogrenciSayisi;
    String ogrenciAdi;
    int ogrenciNo;
    String ogrenciSinifi;

    public Ögrenci(String ogrenciAdi, int ogrenciNo, String ogrenciSinifi) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciNo = ogrenciNo;
        this.ogrenciSinifi = ogrenciSinifi;
    }


    public void ogrenciBilgileri(){

        System.out.println("*****Ogrenci Bilgileri***");
        System.out.println("-------------------------");
        System.out.println("Ogrenci adi:"+this.ogrenciAdi);
        System.out.println("OgrenciNO:"+this.ogrenciNo);
        System.out.println("Ogrencinin sinifi:"+this.ogrenciSinifi);



    }


}
