package gunler.gun15_cuma4;

import java.util.Scanner;

public class GirlrnDegerleriToplama {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        int toplam=0;




        while(true){

            System.out.println("bir deger giriniz");
            int sayi=scan.nextInt();

            toplam=toplam+sayi;

            if(sayi==0){




                break;



            }

            System.out.println("tolam: "+toplam);



        }



    }
}
