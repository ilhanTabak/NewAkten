package gunler.gun69_persembe26;

import gunler.gun8_carsamba26.Kdv_hesaplama;

public class FinalMetodChild extends FinalMetodParent{

    public static void main(String[] args) {

        FinalMetodChild ornekChild=new FinalMetodChild();

        System.out.println(ornekChild.KDV_ORANI);

        System.out.println(ornekChild.kdvHesapla(100));

        System.out.println(ornekChild.kdvHesapla(100));


    }

    public  double kdvHesapla(double fiyat){


        return (fiyat*0.1)+fiyat;
    }


}
