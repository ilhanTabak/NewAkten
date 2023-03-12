package gunler.gun40_cuma09;

public class metotlarVeyaFonksiyonlar {


    public static void main(String[] args) {
        int yeni=f(5);
        System.out.println("yeni = " + yeni);



        power(4,5);


    }


    public static int f(int x){

        int result=(x+2)*6;

        return result;

    }
    public static int power(int number,int number2){
        int sonuc=1;
        int result=1;
        for (int i = 1; i <number2 ; i++) {

            sonuc=sonuc*number;

        }

        return sonuc;

    }
}
