package gunler.gun48_carsamba21;

public class arrayAlistirma2 {


    public static boolean abc(int ornekArray[]) {


        boolean sonuc=true;


        for (int i = 0; i <ornekArray.length ; i++) {

            if((ornekArray.length==1||ornekArray.length>1)&&(ornekArray[0]==ornekArray[ornekArray.length-1])){


                sonuc=true;

        }else{
                sonuc=false;
            }


    }
                return sonuc;

}
















    public static void main(String[] args) {








    }



}
