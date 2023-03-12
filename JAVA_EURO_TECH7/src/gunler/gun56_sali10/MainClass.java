package gunler.gun56_sali10;

public class MainClass {


    static int sayi = 5;
    int number=0;


    static {
        //static block

        System.out.println("static block 2");


    }


    public static void main(String[] args) {

        System.out.println("main method block");


        MainClass main1=new MainClass();

    }


    static {
        //static block

        System.out.println("static block 1");




    }

    {
        //non-static block

        System.out.println("non static block");
        number=500;
        System.out.println("non static"+number);


    }

    MainClass() {
        System.out.println("constracter block");

        number=35;

        System.out.println("number in constracter="+number);


    }


}
