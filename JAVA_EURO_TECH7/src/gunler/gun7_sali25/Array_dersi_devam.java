package gunler.gun7_sali25;

public class Array_dersi_devam {


    public static void main(String[] args) {




        double[]mylist={1.2,3.1,5.1};

        double total=0;
        double max=mylist[0];


        for(double number:mylist){

            if(max<number){

                max=number;
            }

            total=total+number;

            System.out.println(number);

            System.out.println(total);
            System.out.println("en buyuk sayi "+max);


        }
    }
}
