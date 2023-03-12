package gunler.gun5_cuma21;

import java.util.Scanner;

public class atm_ornegi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi=scan.nextInt();
        int bakiye=1000;
        int islem;

        System.out.println("1:Bakiye goruntule");
        System.out.println("2:Para yatirma");
        System.out.println("3.Para cekme");
        System.out.println("4:Sistemden cikis");

        islem=scan.nextInt();

        switch (islem){
            case 1:
                System.out.println("Bakiyeniz:"+bakiye+"tl dir");
                break;

            case 2:
                System.out.println("Ne kadar yatiracaksiniz");
                int miktar=scan.nextInt();
                bakiye=bakiye+miktar;
                System.out.println("Bakiyeniz"+bakiye+"tl dir");
            case 3:
                System.out.println("Ne kadar cekeceksiniz");
                miktar=scan.nextInt();
                bakiye-=miktar;
                System.out.println("Bakiyeniz:"+bakiye+"tl dir" );
                break;

                case 4:
            System.out.println("Sistemden cikiliyor");
            break;
            default:
            System.out.println("Gecersiy islem");
            break;

        }


    }
}
