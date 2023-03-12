package gunler.gun46_pazartesi19;

import java.util.Arrays;

public class ArrayList {
    public static void main(String[] args) {


     int numarlar[]={1,2,3,4,5};
     int []numara=new int[4];

     numara[0]=5;
     numara[1]=4;

     int []alininSinavSonuclari={90,80,70,80,100};

        System.out.println("alininSinavSonuclari.length = " + alininSinavSonuclari.length);


        for (int i = 0; i <alininSinavSonuclari.length ; i++) {


            System.out.println(alininSinavSonuclari[i]);


        }

        for (int aa:alininSinavSonuclari) {

            System.out.println(aa);


        }
        int []alininiSinavSonuclari={90,80,70,80,100};
        int[]veliniSinavSonuclari={80,100,90,85,90};
        int[]ayseninSinavSonuclari={85,90,100,90,95};

        int []sinavSonuclar[]={
                {90,80,70,80,100},
                {80,100,90,85,90},
                {85,90,100,90,95}
        };

        System.out.println(Arrays.toString(veliniSinavSonuclari));




    }


}
