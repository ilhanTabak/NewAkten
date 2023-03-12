package gunler.gun52_carsamba04;

import java.util.ArrayList;

public class OtoPark {

    String name;
    String adres;
    ArrayList<Car>arabalar=new ArrayList<>();


    public OtoPark(String name, String adres) {
        this.name = name;
        this.adres = adres;
    }


    public void arabaEkle(Car araba){


        System.out.println(araba.marka+"marka"+araba.plakasi+"plakali arac otoparka giris yapti");

        this.arabalar.add(araba);
        System.out.println("otopartkta"+arabalar.size()+"araba var");
    }

    public void arabaListesi(){

        System.out.println(this.name+"park etmis arabalar listesi");
        System.out.println("----------------------------------------");
        for (Car araba:this.arabalar) {
            System.out.println(araba);

        }

    }


    public String toString() {
        return "OtoPark{" +
                "name='" + name + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
