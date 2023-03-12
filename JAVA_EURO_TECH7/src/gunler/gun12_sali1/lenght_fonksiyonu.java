package gunler.gun12_sali1;

import java.util.Scanner;

public class lenght_fonksiyonu {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("isminiz nedir");

        String isim=scan.next();

        System.out.println("yasiniz kac");

        int yas=scan.nextInt();


        int harfSayisi=isim.length();

        if(harfSayisi>7 && yas<25){

            System.out.println("sansiniz bugun gayet iyi");



        }

        else if(harfSayisi<=7 && yas>=25){
            System.out.println("bugun kotu gununuz");
        }
         else{

            System.out.println("ne desek bos");

        }
    }
}
