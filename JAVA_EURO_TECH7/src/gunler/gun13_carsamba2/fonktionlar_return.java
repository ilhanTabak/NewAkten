package gunler.gun13_carsamba2;

public class fonktionlar_return {






    public static int ucilecarp(int a){

      return a*3;

    }

    public static int ikiiletopla(int a){


        return a+2;
    }

    public static int dortcikar(int a){

        return a-4;
    }
    public static void main(String[] args) {


        System.out.println("anin dgeri:" +ucilecarp(ikiiletopla(dortcikar(5))));

    }



}



