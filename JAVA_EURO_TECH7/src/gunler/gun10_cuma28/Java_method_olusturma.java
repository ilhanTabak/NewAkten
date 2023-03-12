package gunler.gun10_cuma28;

public class Java_method_olusturma {

    public static void main(String[] args) {


        /*input olarak verilen isim ve soyisim ilk harfleri buyuk diger harfler kucuk olarak degistitirp programin sonraki
        bolumlerinde kullanabilmek uyere isimSoyisim variable ina atayacak bir method olusturun
        input-Isim:ALI,Soyisim :CAN
        Output-isimSoyisim:Ali Can seklinde kayit

         */



        String isim="ali";
        String soyisim="veli";

       String isimSoyisim=isimDuzenle(isim,soyisim);

        System.out.println("ilk girilen:"+isim+" "+soyisim);
        System.out.println("degistirilmis hali: "+isimSoyisim);


    }

    private static String isimDuzenle(String isim, String soyisim) {


        String isimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                               isim.substring(1).toLowerCase();

        String soyisimDuzenlenmis=isim.substring(0,1).toUpperCase()+
                soyisim.substring(1).toLowerCase();

        return isimDuzenlenmis+" "+soyisimDuzenlenmis;


    }
}
