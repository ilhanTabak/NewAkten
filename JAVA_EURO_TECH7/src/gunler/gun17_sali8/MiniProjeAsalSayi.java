package gunler.gun17_sali8;

public class MiniProjeAsalSayi {


    public static void main(String[] args) {


        int toplam=0;
        int number=20;
        boolean sonuc=true;


        for (int i = 1; i <number ; i++) {

            if(number%i==0) {


                toplam=toplam+i;

            }

            if(toplam==number){


                sonuc=true;


            }else{

                sonuc=false;
            }




        }

        System.out.println(number+" mukemmel sayimidir " +sonuc);

    }
}
