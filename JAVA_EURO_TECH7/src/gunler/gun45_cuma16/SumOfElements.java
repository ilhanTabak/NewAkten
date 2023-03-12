package gunler.gun45_cuma16;

public class SumOfElements {


    public static void main(String[] args) {





    }


    public static int[] enBuyuk(int[]a1,int[]a2){


        int toplam1=0;
        int toplam2=0;

        for (int i = 0; i <a1.length ; i++) {

            toplam1=toplam1+a1[i];


        }

        for (int i = 0; i < a2.length; i++) {
            toplam2=toplam2+a2[i];
        }


        if(toplam1>toplam2){

            return a1;
        }else{

           return a2;
        }


    }

}
