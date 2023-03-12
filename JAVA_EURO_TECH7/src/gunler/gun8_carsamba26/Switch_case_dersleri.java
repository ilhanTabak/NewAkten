package gunler.gun8_carsamba26;

import java.util.Scanner;

public class Switch_case_dersleri {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("2 tane sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        System.out.println("islem turu seciniz *,/,+,-");
        char islem=scan.next().charAt(0);

        switch (islem){


            case '*':
                System.out.println("sonuc: "+(sayi1*sayi2));
                break;
            case'/':
                System.out.println("sonuc: "+(sayi1/sayi2));
                break;
            case '+':
                System.out.println("sonuc: "+(sayi1+sayi2));
                break;
            case'-':
                System.out.println("sonuc: "+(sayi1-sayi2));
                break;


        }


    }
}
