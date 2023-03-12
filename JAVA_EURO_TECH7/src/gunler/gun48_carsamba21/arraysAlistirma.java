package gunler.gun48_carsamba21;

public class arraysAlistirma {


    public static void main(String[] args) {
        int[]ornekArray={1,2,3,4,5,6};
        int[]ornekArray2={6,5,4,3,2,1};
        int[]ornekArray3={2,3,4,5,1};


        boolean ogren=altimi(ornekArray3,ornekArray2);
        System.out.println(ogren);



    }

public static boolean altimi(int[] numara,int[]numara2){

        boolean sonuc=true;

        for (int i = 0; i <numara.length ; i++) {

            if(numara[0]==numara2[0]||numara[numara.length-1]==numara2[numara2.length-1]){

                sonuc=true;
            }else{

                sonuc=false;
            }


        }

        return sonuc;

    }



}
