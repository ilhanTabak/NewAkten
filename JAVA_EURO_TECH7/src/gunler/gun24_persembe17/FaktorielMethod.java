package gunler.gun24_persembe17;

public class FaktorielMethod {

    public static void main(String[] args) {

        faktoriel(7);



    }

    public static void faktoriel(int sayi){
                 int fakt=1;

        for (int i = 1; i <=sayi ; i++) {



            fakt=fakt*i;


        }

        System.out.println(fakt);


    }


}
