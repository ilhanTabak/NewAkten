package gunler.gun70_cuma27;

public class Ev {



    private Oda oda;
    private Cati cati;
    private Mutfak mutfak;
    private Bahce bahce;



    private String isim;


    public Ev(Oda oda, Cati cati, Mutfak mutfak, Bahce bahce, String isim) {
        this.oda = oda;
        this.cati = cati;
        this.mutfak = mutfak;
        this.bahce = bahce;
        this.isim = isim;
    }

    public Ev(String isim) {
        this.isim = isim;
    }


    public void kapiAc(){


        System.out.println("kapi acildi");
    }



}
