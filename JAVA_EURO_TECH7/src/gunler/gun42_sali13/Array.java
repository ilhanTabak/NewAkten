package gunler.gun42_sali13;

import java.util.Scanner;

public class Array {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("bir urun giriniz");
      String istenenUrun=scan.next();




       String[]urunler=new String[4];
       urunler[0]="domates";
       urunler[1]="biber";
       urunler[2]="patates";
       urunler[3]="patlican";

        for (int i = 0; i <urunler.length ; i++) {
            if(urunler[i].equals(istenenUrun)){

                System.out.println("bu urun var");
                break;
            }else{

                System.out.println("bu urun yok");
                break;
            }

        }




    }
}
