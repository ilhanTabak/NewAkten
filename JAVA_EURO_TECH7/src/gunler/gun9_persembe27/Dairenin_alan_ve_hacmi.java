package gunler.gun9_persembe27;

import java.util.Scanner;

public class Dairenin_alan_ve_hacmi {


    public static void main(String[] args) {
        double daireninAlani;
        double daireninCevresi;
        double yaricap;
        double pisayisi=3.14;

        Scanner scan=new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz");

        yaricap= scan.nextDouble();

        daireninAlani=pisayisi*yaricap*yaricap;
        daireninCevresi=pisayisi*yaricap*2;

        System.out.println("dairenin alani: "+daireninAlani);
        System.out.println("dairenin cevresi: "+daireninCevresi);





    }
}
