package gunler.gun24_persembe17;

public class asalSayiYeniCalisma {

    public static void main(String[] args) {


        int sayi=127;
        int sayac=0;

        for (int i = 2; i <sayi ; i++) {


            if(sayi%i==0){

                sayac++;

            }


              }
        if(sayac>0){

            System.out.println("sayi asal degil");

            }else {

            System.out.println("sayi asal");
        }


        }


    }


