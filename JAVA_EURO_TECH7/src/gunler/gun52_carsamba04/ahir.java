package gunler.gun52_carsamba04;

import java.util.ArrayList;

public class ahir {


    public static String ahirAdi="sariEv";
    public static String ahirAdresi="Edirne";
    static int hayvanSayisi;

    ArrayList<Cow>inekler=new ArrayList<>();




    public  void inekEkle(Cow inek){


        this.inekler.add(inek);

        System.out.println("inekler.size() = " + inekler.size());


    }



    public static void zayifHayvanlar(Cow ZayifInek) {


        for (int i = 0; i <Cow.hayvanSayisi; i++) {


            if (ZayifInek.agirligi > 200) {

                System.out.println("bu hayvan cok zayif");


            } else {

                System.out.println("bu hayvan sisman");
            }


        }

    }


    }



