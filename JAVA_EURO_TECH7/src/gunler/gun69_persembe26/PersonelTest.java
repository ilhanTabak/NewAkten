package gunler.gun69_persembe26;

import java.util.Scanner;

public class PersonelTest {

    public static void main(String[] args) {


        Personal personel1=new Personal();


        Scanner scan=new Scanner(System.in);

        System.out.println("isminizi giriniz");


        personel1.setVorName(scan.next());

        System.out.println("soyadinizi giriniz");

        personel1.setNachName(scan.next());

        System.out.println("email giriniz");

        personel1.seteMail(scan.next());

        personel1.mailTest(personel1.geteMail());

        System.out.println("dogum yilinizi giriniz");

        personel1.setDogumYili(scan.nextInt());

        System.out.println(personel1.getYas(personel1.getDogumYili()));

        personel1.adSoyad(personel1.getVorName(),personel1.getNachName());

        System.out.println(Personal.counter+"sayili personel");

        System.out.println(personel1.getVorName());


    }
}
