package gunler.gun55_pazartesi09;

public class Training {

    public static void main(String[] args) {




     long egebnis=cat(17);

        System.out.println(egebnis);





    }



    public static int cat(int n){



        int count=1;
        int sonuc=0;

        for (int i = 1; i <=n ; i++) {

           sonuc=sonuc+count;



            System.out.print(sonuc+" ");


        }

        return sonuc;
        }







    }









