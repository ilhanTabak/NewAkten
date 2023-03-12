package gunler.gun48_carsamba21;

public class arrayAlistirma3 {





    public static int toplam(int []ornekArray){

        int total=0;

        for (int i = 0; i <ornekArray.length ; i++) {

            total=total+ornekArray[i];

        }

        return total;


    }


    public static void main(String[] args) {

        int[] ali={1,8,25};

        int ss=toplam(ali);

        System.out.println(ss);

    }
}
