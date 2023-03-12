package gunler.gun51_sali03;

public class OkulProgrami {
    public static void main(String[] args) {

        Ögrenci ögrenci1=new Ögrenci("ali",1,"1a");

        ögrenci1.ogrenciBilgileri();

        Ögrenci ögrenci2=new Ögrenci("Ayse",2,"1a");

        ögrenci2.ogrenciBilgileri();

        Ögrenci ögrenci3=new Ögrenci("Ahmet",3,"1a");

        ögrenci3.ogrenciBilgileri();

        Okul okulum=new Okul("abc","aydin");

        okulum.ogrenciBilgileri();


    }
}
