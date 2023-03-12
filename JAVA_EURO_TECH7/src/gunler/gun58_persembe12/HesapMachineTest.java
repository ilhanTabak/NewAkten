package gunler.gun58_persembe12;

public class HesapMachineTest {
    public static void main(String[] args) {

        HesapMachine.topla(2,3);

        System.out.println(HesapMachine.sonuc);

        HesapMachine.topla(2,5,6,2,8,5,6,4,7,4,5);

        Ogrenci ogrenci5=new Ogrenci("arzu");
        Ogrenci ogrenci6=new Ogrenci("dudu");

        HesapMachine.ogrenciEEkle(ogrenci5,ogrenci6);






    }
}
