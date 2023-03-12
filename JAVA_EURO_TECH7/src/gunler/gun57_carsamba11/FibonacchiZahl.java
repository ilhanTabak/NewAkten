package gunler.gun57_carsamba11;

public class FibonacchiZahl {


    public static void main(String[] args) {

        int sonraki=1;
        int onceki=0;
        int sonuc;


        System.out.println(0+"\n"+1);


        for (int i = 0; i <20-2 ; i++) {

            //0 1 1 2 3 5 8 13 21


         sonuc=onceki+sonraki;
            onceki=sonraki;
         sonraki=sonuc;


            System.out.println(sonuc);

        }



    }



}
