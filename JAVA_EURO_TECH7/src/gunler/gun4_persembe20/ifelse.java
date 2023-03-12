package gunler.gun4_persembe20;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Kac yasindasiniz?");

        int yas= scan.nextInt();


        if(yas>50&&yas<100){
            System.out.println("cok yaslisiniz");
        }

        else if(yas<30) {
            System.out.println("cok gencsin");
        }
        else{
            System.out.println("eh iste");
        }

    }
}
