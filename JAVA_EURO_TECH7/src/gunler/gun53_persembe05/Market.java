package gunler.gun53_persembe05;

import java.util.Date;

public class Market {

    public static void main(String[] args) {
        System.out.println("ABC markete Hos geldiniz");

        Urun urun1=new Urun("elma",15,5,"yiyecek");
        Urun urun2=new Urun("peynir",150,1,"yiyecek");
        Urun urun3=new Urun("deterjan",250,1,"temizlik");

        Sepet sepet=new Sepet();

        sepet.sepeteEkle(urun1);
        sepet.sepeteEkle(urun2);
        sepet.sepeteEkle(urun3);

        //System.out.println(sepet);

        Fatura fatura=new Fatura(new Date(),sepet);
        System.out.println(fatura);


    }
}
