package gunler.gun33_carsamba30;

public class AsalSayilarBulma {

    public static void main(String[] args) {

        boolean asalsayimi=true;

        int sayac=0;

        for (int i = 2; i <100 ; i++) {

            for (int j = 2; j < i; j++) {

                if(i%j==0){

                   asalsayimi=false;


                }
            }

            if(asalsayimi){

                System.out.println(i+"asal sayidir");
            }

            asalsayimi=true;

        }



    }


}
