package gunler.gun46_pazartesi19;

public class telefonRehberiProgrami {

    public static void main(String[] args) {


        System.out.println("telefon rehberi programi");

        kisi[]rehberim=new kisi[3];


        kisi adam=new kisi();
        adam.telNo=4587444;
        adam.adresi="mars";
        adam.ad="mehmet";
        adam.printInfo();

         rehberim[0]=adam;

        kisi kadin=new kisi();
        kadin.telNo=2587412;
        kadin.adresi="venus";
        kadin.ad="ayla";
        kadin.printInfo();

        rehberim[1]=kadin;


        kisi cocuk=new kisi();
        cocuk.telNo=2587412;
        cocuk.adresi="venus";
        cocuk.ad="ayla";
        cocuk.printInfo();
        rehberim[2]=cocuk;


        for (int i = 0; i <rehberim.length ; i++) {

            System.out.println(rehberim[i]);

        }


    }




}
