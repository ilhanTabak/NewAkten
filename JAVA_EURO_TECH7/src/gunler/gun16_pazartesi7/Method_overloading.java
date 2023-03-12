package gunler.gun16_pazartesi7;

public class Method_overloading {




    public static void toplama(int a,int b,int c){


        System.out.println("toplamlari: "+(a+b+c));


    }

      public static void toplama(int a,int b){


          System.out.println("toplamlari: "+(a+b));
      }




    public static void main(String[] args) {



        toplama(2,3,4);
        toplama(5,7);


    }
}
