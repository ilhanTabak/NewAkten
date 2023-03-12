package gunler.gun36_pazartesi05;

public class MathTest {


    public static void main(String[] args) {

        System.out.println(Math.max(4,5));





    }

      public static int kucuksayi(int a,int b,int c){

          int kucuk= Math.min(a,b);
          int enKucuk=Math.min(kucuk,c);

          return enKucuk;


      }



}
