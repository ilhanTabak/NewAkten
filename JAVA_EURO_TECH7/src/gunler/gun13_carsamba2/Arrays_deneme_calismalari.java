package gunler.gun13_carsamba2;

public class Arrays_deneme_calismalari {


    public static void main(String[] args) {


        int a=5;
        int b=3;
        int c=4;

        if (a>b&&a>c&&b>c) {

            System.out.println("a>b>c");

        }else if(b>c&&b>a&&a>c){


            System.out.println("b>a>c");
        }else if(c>a&&c>b&&b>a){
            System.out.println("c>b>a");
        }else{
            System.out.println("a>c>b");
        }




    }
}
